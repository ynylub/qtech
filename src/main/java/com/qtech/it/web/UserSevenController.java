package com.qtech.it.web;

import com.qtech.it.model.UserSeven;
import com.qtech.it.service.UserSevenService;
import com.qtech.it.utils.ExcleUtils;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.Iterator;
import java.util.List;

@Controller
public class UserSevenController {

    @Resource
    private UserSevenService userSevenService;

    // 分页
    @RequestMapping("/list7")
    public String list(Model model, @RequestParam(value = "pageNum", defaultValue = "0") int pageNum, @RequestParam(value = "pageSize", defaultValue = "15") int pageSize) {
        System.out.println("============================");
        Page<UserSeven> users=userSevenService.getUserList(pageNum, pageSize);
        System.out.println("总页数" + users.getTotalPages());
        System.out.println("当前页是：" + pageNum);

        System.out.println("分页数据：");
        Iterator<UserSeven> u = users.iterator();
        while (u.hasNext()){
            System.out.println(u.next().toString());
        }
        model.addAttribute("users", users);
        return "category_seven/list7";
    }

    // 添加记录
    @RequestMapping("/toAdd7")
    public String toAdd() {
        return "category_seven/userAdd7";
    }

    @RequestMapping("/add7")
    public String add(UserSeven userSeven) {
        userSevenService.save(userSeven);
        return "redirect:/list7";
    }

    // 编辑，更新记录
    @RequestMapping("/toEdit7")
    public String toEdit(Model model,Long id) {
        UserSeven user=userSevenService.findUserById(id);
        model.addAttribute("user", user);
        return "category_seven/userEdit7";
    }

    @RequestMapping("/edit7")
    public String edit(UserSeven userSeven) {
        userSevenService.edit(userSeven);
        return "redirect:/list7";
    }

    // 删除
    @RequestMapping("/delete7")
    public String delete(Long id) {
        userSevenService.delete(id);
        return "redirect:/list7";
    }

    // excel 下载,后缀名是 .xls是excel2003及以前版本生成的文件格式
    @GetMapping("/download7")
    @ResponseBody
    public void downLoadExcel(String title, HttpServletResponse response) {
        String sheetName="用户";
        List<UserSeven> userList = userSevenService.selectAll();
        ExcleUtils.downloadExcel(userList,title,sheetName,UserSeven.class,title+".xls",response);
    }

    // 查询 单个id
    @RequestMapping("/findById7")
    public String findByID(Long id){
        userSevenService.findUserById(id);
        return "redirect:/list7";
    }

}
