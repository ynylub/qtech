package com.qtech.it.web;

import com.qtech.it.model.UserSix;
import com.qtech.it.service.UserSixService;
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
public class UserSixController {

    @Resource
    private UserSixService userSixService;

    // 分页
    @RequestMapping("/list6")
    public String list(Model model, @RequestParam(value = "pageNum", defaultValue = "0") int pageNum, @RequestParam(value = "pageSize", defaultValue = "15") int pageSize) {
        System.out.println("============================");
        Page<UserSix> users=userSixService.getUserList(pageNum, pageSize);
        System.out.println("总页数" + users.getTotalPages());
        System.out.println("当前页是：" + pageNum);

        System.out.println("分页数据：");
        Iterator<UserSix> u = users.iterator();
        while (u.hasNext()){
            System.out.println(u.next().toString());
        }
        model.addAttribute("users", users);
        return "category_six/list6";
    }

    // 添加记录
    @RequestMapping("/toAdd6")
    public String toAdd() {
        return "category_six/userAdd6";
    }

    @RequestMapping("/add6")
    public String add(UserSix userSix) {
        userSixService.save(userSix);
        return "redirect:/list6";
    }

    // 编辑，更新记录
    @RequestMapping("/toEdit6")
    public String toEdit(Model model,Long id) {
        UserSix user=userSixService.findUserById(id);
        model.addAttribute("user", user);
        return "category_six/userEdit6";
    }

    @RequestMapping("/edit6")
    public String edit(UserSix userSix) {
        userSixService.edit(userSix);
        return "redirect:/list6";
    }

    // 删除
    @RequestMapping("/delete6")
    public String delete(Long id) {
        userSixService.delete(id);
        return "redirect:/list6";
    }

    // excel 下载,后缀名是 .xls是excel2003及以前版本生成的文件格式
    @GetMapping("/download6")
    @ResponseBody
    public void downLoadExcel(String title, HttpServletResponse response) {
        String sheetName="用户";
        List<UserSix> userList = userSixService.selectAll();
        ExcleUtils.downloadExcel(userList,title,sheetName,UserSix.class,title+".xls",response);
    }

    // 查询 单个id
    @RequestMapping("/findById6")
    public String findByID(Long id){
        userSixService.findUserById(id);
        return "redirect:/list6";
    }

}
