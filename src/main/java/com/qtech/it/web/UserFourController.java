package com.qtech.it.web;

import com.qtech.it.model.UserFour;
import com.qtech.it.service.UserFourService;
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
public class UserFourController {

    @Resource
    private UserFourService userFourService;

    // 分页
    @RequestMapping("/list4")
    public String list(Model model, @RequestParam(value = "pageNum", defaultValue = "0") int pageNum, @RequestParam(value = "pageSize", defaultValue = "15") int pageSize) {
        System.out.println("============================");
        Page<UserFour> users=userFourService.getUserList(pageNum, pageSize);
        System.out.println("总页数" + users.getTotalPages());
        System.out.println("当前页是：" + pageNum);

        System.out.println("分页数据：");
        Iterator<UserFour> u = users.iterator();
        while (u.hasNext()){
            System.out.println(u.next().toString());
        }
        model.addAttribute("users", users);
        return "category_four/list4";
    }

    // 添加记录
    @RequestMapping("/toAdd4")
    public String toAdd() {
        return "category_four/userAdd4";
    }

    @RequestMapping("/add4")
    public String add(UserFour userFour) {
        userFourService.save(userFour);
        return "redirect:/list4";
    }

    // 编辑，更新记录
    @RequestMapping("/toEdit4")
    public String toEdit(Model model,Long id) {
        UserFour user=userFourService.findUserById(id);
        model.addAttribute("user", user);
        return "category_four/userEdit4";
    }

    @RequestMapping("/edit4")
    public String edit(UserFour userFour) {
        userFourService.edit(userFour);
        return "redirect:/list4";
    }

    // 删除
    @RequestMapping("/delete4")
    public String delete(Long id) {
        userFourService.delete(id);
        return "redirect:/list4";
    }

    // excel 下载,后缀名是 .xls是excel2003及以前版本生成的文件格式
    @GetMapping("/download4")
    @ResponseBody
    public void downLoadExcel(String title, HttpServletResponse response) {
        String sheetName="用户";
        List<UserFour> userList = userFourService.selectAll();
        ExcleUtils.downloadExcel(userList,title,sheetName,UserFour.class,title+".xls",response);
    }

    // 查询 单个id
    @RequestMapping("/findById4")
    public String findByID(Long id){
        userFourService.findUserById(id);
        return "redirect:/list4";
    }

}
