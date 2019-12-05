package bonc.com.cn.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import bonc.com.cn.Interceptor.MyInterceptor;

/**
 * 
 * @author whw
 *
 */
@Configuration
public class IndexAndCROSAndInterceptor implements WebMvcConfigurer {
	/**
	 * @return 输入localhost:8080返回默认页面index.html
	 */
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("forward:/index.html");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
	}
	/**
	 * @return 设置跨域允许localhost:8081请求访问
	 */
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/*")
			.allowedMethods("*")
			.allowedHeaders("*")
			.maxAge(1800)
			.allowedOrigins("http://localhost:8081");
	}
	/**
	 * @return 拦截器设置拦截所有
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new MyInterceptor()).addPathPatterns("*").excludePathPatterns("*");
	}
	
	

}
