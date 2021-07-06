package com.qtech.it.web;

import com.qtech.it.model.User;
import com.qtech.it.service.impl.LoginServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private LoginServiceImpl loginServiceImpl;

//    @RequestMapping("/")
//    public String index(){
//        return "index";
//    }

    @RequestMapping("/user/login")
    public String login(){
        return "next_page/login";
    }

    @RequestMapping("/doLogin")
    public String doLogin(User user, Map<String,Object> map){
        User user1 =  loginServiceImpl.getUser(user.getPassword(),user.getUsername());
        if(user1 == null){
            map.put("msg","登入失败,请返回上一级页面重新尝试");
            return "next_page/page_view";
        }else{
            map.put("msg","登入成功,已为您跳转到二级目录 首页");
            return "next_page/page2";
        }
//        return "next_page/page_view";
    }

//    @RequestMapping("/regist")
//    public String regist(){
//        return "regist";
//    }
//
//    @RequestMapping("doRegist")
//    public String doRegist(User user, Map<String,Object> map){
//        loginServiceImpl.insertUser(user);
//        map.put("msg","注册成功,已为您跳转到登录页面");
//        return "login";
//    }

}
