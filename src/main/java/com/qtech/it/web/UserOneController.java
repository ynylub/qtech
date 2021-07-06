package com.qtech.it.web;

import com.qtech.it.model.UserOne;
import com.qtech.it.service.UserOneService;
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
public class UserOneController {

    @Resource
    private UserOneService userOneService;

    // 分页
    @RequestMapping("/list")
    public String list(Model model, @RequestParam(value = "pageNum", defaultValue = "0") int pageNum, @RequestParam(value = "pageSize", defaultValue = "15") int pageSize) {
        System.out.println("============================");
        Page<UserOne> users=userOneService.getUserList(pageNum, pageSize);
        System.out.println("总页数" + users.getTotalPages());
        System.out.println("当前页是：" + pageNum);

        System.out.println("分页数据：");
        Iterator<UserOne> u = users.iterator();
        while (u.hasNext()){
            System.out.println(u.next().toString());
        }
        model.addAttribute("users", users);
        return "category_one/list";
    }

    // 添加记录
    @RequestMapping("/toAdd")
    public String toAdd()  {
        return "category_one/userAdd";
    }

    @RequestMapping("/add")
    public String add(UserOne userOne) {
        userOneService.save(userOne);
        return "redirect:/list";
    }

    // 编辑，更新记录
    @RequestMapping("/toEdit")
    public String toEdit(Model model,Long id) {
        UserOne user=userOneService.findUserById(id);
        model.addAttribute("user", user);
        return "category_one/userEdit";
    }

    @RequestMapping("/edit")
    public String edit(UserOne userOne) {
        userOneService.edit(userOne);
        return "redirect:/list";
    }

    // 删除
    @RequestMapping("/delete")
    public String delete(Long id) {
        userOneService.delete(id);
        return "redirect:/list";
    }

    // excel 下载,后缀名是 .xls是excel2003及以前版本生成的文件格式
    @GetMapping("/download")
    @ResponseBody
    public void downLoadExcel(String title, HttpServletResponse response) {
        String sheetName="用户";
        List<UserOne> userList = userOneService.selectAll();
        ExcleUtils.downloadExcel(userList,title,sheetName,UserOne.class,title+".xls",response);
    }

    // 查询 单个id
    @RequestMapping("/findById")
    public String findByID(Long id){
        userOneService.findUserById(id);
        return "redirect:/list";
    }

}
