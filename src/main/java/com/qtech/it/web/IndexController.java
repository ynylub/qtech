package com.qtech.it.web;

import com.qtech.it.model.UserZero;
import com.qtech.it.service.impl.LoginZeroServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;

@Controller
//@RestController
public class IndexController {

    @Autowired
    private LoginZeroServiceImpl loginZeroServiceImpl;

    @RequestMapping("/")
    public String index() {
//        return "redirect:/list";
        return "home_page/index_login";
    }

    @RequestMapping("/index_doLogin")
    public String doLogin(UserZero user, Map<String,Object> map) {
        UserZero user0 = loginZeroServiceImpl.getUserZero(user.getPassword(), user.getUsername());
        if (user0 == null) {
            map.put("msg", "登入失败,请联系管理员");
            return "home_page/page_view";
        } else {
            map.put("msg", "登入成功");
            return "home_page/index";
        }
    }

}
