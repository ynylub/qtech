package com.qtech.it.web;

import com.qtech.it.model.UserFive;
import com.qtech.it.service.UserFiveService;
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
public class UserFiveController {

    @Resource
    private UserFiveService userFiveService;

    // 分页
    @RequestMapping("/list5")
    public String list(Model model, @RequestParam(value = "pageNum", defaultValue = "0") int pageNum, @RequestParam(value = "pageSize", defaultValue = "15") int pageSize) {
        System.out.println("============================");
        Page<UserFive> users=userFiveService.getUserList(pageNum, pageSize);
        System.out.println("总页数" + users.getTotalPages());
        System.out.println("当前页是：" + pageNum);

        System.out.println("分页数据：");
        Iterator<UserFive> u = users.iterator();
        while (u.hasNext()){
            System.out.println(u.next().toString());
        }
        model.addAttribute("users", users);
        return "category_five/list5";
    }

    // 添加记录
    @RequestMapping("/toAdd5")
    public String toAdd() {
        return "category_five/userAdd5";
    }

    @RequestMapping("/add5")
    public String add(UserFive userFive) {
        userFiveService.save(userFive);
        return "redirect:/list5";
    }

    // 编辑，更新记录
    @RequestMapping("/toEdit5")
    public String toEdit(Model model,Long id) {
        UserFive user=userFiveService.findUserById(id);
        model.addAttribute("user", user);
        return "category_five/userEdit5";
    }

    @RequestMapping("/edit5")
    public String edit(UserFive userFive) {
        userFiveService.edit(userFive);
        return "redirect:/list5";
    }

    // 删除
    @RequestMapping("/delete5")
    public String delete(Long id) {
        userFiveService.delete(id);
        return "redirect:/list5";
    }

    // excel 下载,后缀名是 .xls是excel2003及以前版本生成的文件格式
    @GetMapping("/download5")
    @ResponseBody
    public void downLoadExcel(String title, HttpServletResponse response) {
        String sheetName="用户";
        List<UserFive> userList = userFiveService.selectAll();
        ExcleUtils.downloadExcel(userList,title,sheetName,UserFive.class,title+".xls",response);
    }

    // 查询 单个id
    @RequestMapping("/findById5")
    public String findByID(Long id){
        userFiveService.findUserById(id);
        return "redirect:/list5";
    }

}
