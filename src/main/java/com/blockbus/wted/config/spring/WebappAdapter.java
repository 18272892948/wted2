package com.blockbus.wted.config.spring;


import com.blockbus.wted.config.filter.ManagerLoginFilter;
import com.blockbus.wted.config.filter.UserLoginFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebappAdapter implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration mem= registry.addInterceptor(new UserLoginFilter());

        // 拦截地址配置
        mem.addPathPatterns("/usr/**");

        // 忽略地址配置
        mem.excludePathPatterns("/usr/regist");
        mem.excludePathPatterns("/usr/login");
        mem.excludePathPatterns("/usr/logout");
        mem.excludePathPatterns("/usr/sendMobileCode");
        mem.excludePathPatterns("/usr/updatePwd");
        mem.excludePathPatterns("/usr/forgetPwd");
        mem.excludePathPatterns("/usr/sendSms");


        InterceptorRegistration adm= registry.addInterceptor(new ManagerLoginFilter());
        // 拦截地址配置
        adm.addPathPatterns("/mgr/**");
        // 忽略地址配置
        adm.excludePathPatterns("/mgr/regist");
        adm.excludePathPatterns("/mgr/login");
        adm.excludePathPatterns("/mgr/logout");


        WebMvcConfigurer.super.addInterceptors(registry);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

}
