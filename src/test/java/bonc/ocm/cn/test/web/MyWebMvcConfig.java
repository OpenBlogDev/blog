package bonc.ocm.cn.test.web;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class MyWebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        // WebMvcConfigurer.super.addResourceHandlers(registry);

        registry.addResourceHandler("/static/**").addResourceLocations("classPath:/static/");
    }

}
