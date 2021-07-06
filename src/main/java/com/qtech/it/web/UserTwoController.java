package com.qtech.it.web;

import com.qtech.it.model.UserTwo;
import com.qtech.it.service.UserTwoService;
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
public class UserTwoController {

    @Resource
    private UserTwoService userTwoService;

    // 分页
    @RequestMapping("/list2")
    public String list(Model model, @RequestParam(value = "pageNum", defaultValue = "0") int pageNum, @RequestParam(value = "pageSize", defaultValue = "15") int pageSize) {
        System.out.println("============================");
        Page<UserTwo> users=userTwoService.getUserList(pageNum, pageSize);
        System.out.println("总页数" + users.getTotalPages());
        System.out.println("当前页是：" + pageNum);

        System.out.println("分页数据：");
        Iterator<UserTwo> u = users.iterator();
        while (u.hasNext()){
            System.out.println(u.next().toString());
        }
        model.addAttribute("users", users);
        return "category_two/list2";
    }

    // 添加记录
    @RequestMapping("/toAdd2")
    public String toAdd() {
        return "category_two/userAdd2";
    }

    @RequestMapping("/add2")
    public String add(UserTwo userTwo) {
        userTwoService.save(userTwo);
        return "redirect:/list2";
    }

    // 编辑，更新记录
    @RequestMapping("/toEdit2")
    public String toEdit(Model model,Long id) {
        UserTwo user=userTwoService.findUserById(id);
        model.addAttribute("user", user);
        return "category_two/userEdit2";
    }

    @RequestMapping("/edit2")
    public String edit(UserTwo userTwo) {
        userTwoService.edit(userTwo);
        return "redirect:/list2";
    }

    // 删除
    @RequestMapping("/delete2")
    public String delete(Long id) {
        userTwoService.delete(id);
        return "redirect:/list2";
    }

    // excel 下载,后缀名是 .xls是excel2003及以前版本生成的文件格式
    @GetMapping("/download2")
    @ResponseBody
    public void downLoadExcel(String title, HttpServletResponse response) {
        String sheetName="用户";
        List<UserTwo> userList = userTwoService.selectAll();
        ExcleUtils.downloadExcel(userList,title,sheetName,UserTwo.class,title+".xls",response);
    }

    // 查询 单个id
    @RequestMapping("/findById2")
    public String findByID(Long id){
        userTwoService.findUserById(id);
        return "redirect:/list2";
    }

}
