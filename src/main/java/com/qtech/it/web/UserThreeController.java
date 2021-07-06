package com.qtech.it.web;

import com.qtech.it.model.UserThree;
import com.qtech.it.service.UserThreeService;
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
public class UserThreeController {

    @Resource
    private UserThreeService userThreeService;

    // 分页
    @RequestMapping("/list3")
    public String list(Model model, @RequestParam(value = "pageNum", defaultValue = "0") int pageNum, @RequestParam(value = "pageSize", defaultValue = "15") int pageSize) {
        System.out.println("============================");
        Page<UserThree> users=userThreeService.getUserList(pageNum, pageSize);
        System.out.println("总页数" + users.getTotalPages());
        System.out.println("当前页是：" + pageNum);

        System.out.println("分页数据：");
        Iterator<UserThree> u = users.iterator();
        while (u.hasNext()){
            System.out.println(u.next().toString());
        }
        model.addAttribute("users", users);
        return "category_three/list3";
    }

    // 添加记录
    @RequestMapping("/toAdd3")
    public String toAdd() {
        return "category_three/userAdd3";
    }

    @RequestMapping("/add3")
    public String add(UserThree userThree) {
        userThreeService.save(userThree);
        return "redirect:/list3";
    }

    // 编辑，更新记录
    @RequestMapping("/toEdit3")
    public String toEdit(Model model,Long id) {
        UserThree user=userThreeService.findUserById(id);
        model.addAttribute("user", user);
        return "category_three/userEdit3";
    }

    @RequestMapping("/edit3")
    public String edit(UserThree userThree) {
        userThreeService.edit(userThree);
        return "redirect:/list3";
    }

    // 删除
    @RequestMapping("/delete3")
    public String delete(Long id) {
        userThreeService.delete(id);
        return "redirect:/list3";
    }

    // excel 下载,后缀名是 .xls是excel2003及以前版本生成的文件格式
    @GetMapping("/download3")
    @ResponseBody
    public void downLoadExcel(String title, HttpServletResponse response) {
        String sheetName="用户";
        List<UserThree> userList = userThreeService.selectAll();
        ExcleUtils.downloadExcel(userList,title,sheetName,UserThree.class,title+".xls",response);
    }

    // 查询 单个id
    @RequestMapping("/findById3")
    public String findByID(Long id){
        userThreeService.findUserById(id);
        return "redirect:/list3";
    }

}
