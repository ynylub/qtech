//package com.qtech.it.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class AdminWebConfig implements WebMvcConfigurer {
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new LoginInterceptor())
//                .addPathPatterns("/**")  //所有请求都被拦截包括静态资源
//                .excludePathPatterns("/","/index_doLogin","/user/login","/css/**","/fonts/**",
//                        "/doLogin",
//                        "/images/**",
//                        "/img/**",
//                        "/js/**"
////                        "/list","/toAdd","/toEdit",
////                        "/list2","/toAdd2","/toEdit2",
////                        "/list3","/toAdd3","/toEdit3",
////                        "/list4","/toAdd4","/toEdit4",
////                        "/list5","/toAdd5","/toEdit5",
////                        "/list6","/toAdd6","/toEdit6",
////                        "/list7","/toAdd7","/toEdit7"
//                ); //放行的请求
//
//    }
//}
//
//
