//package com.qtech.it.config;
//
//import com.qtech.it.filter.SessionFilter;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class WebComponent2Config {
//    @Bean
//    public FilterRegistrationBean someFilterRegistration1() {
//        //新建过滤器注册类
//        FilterRegistrationBean registration = new FilterRegistrationBean();
//        // 添加我们写好的过滤器
//        registration.setFilter( new SessionFilter());
//        // 设置过滤器的URL模式
//        registration.addUrlPatterns("/**");
//        //设置过滤器顺序
//        registration.setOrder(1);
//        return registration;
//    }
//
//}
