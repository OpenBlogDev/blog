package bonc.com.cn.config.datasource;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

@Configuration
@ImportResource("duridDataSourceTest.xml")
@Profile("test")
public class DataSourceConfigTest {

    @Bean
    public ServletRegistrationBean<StatViewServlet> registrationBean() {
        ServletRegistrationBean<StatViewServlet> servletRegistrationBean =
            new ServletRegistrationBean<StatViewServlet>(new StatViewServlet()); // 添加初始化参数：initParams
        servletRegistrationBean.addUrlMappings("/druid/*");
        // 登录查看信息的账号密码.
        // servletRegistrationBean.addInitParameter("loginUsername", "root");
        // servletRegistrationBean.addInitParameter("loginPassword", "root");
        // 是否能够重置数据.
        // servletRegistrationBean.addInitParameter("resetEnable", "false");
        return servletRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean<WebStatFilter> filterRegistrationBean() {
        FilterRegistrationBean<WebStatFilter> filterRegistrationBean =
            new FilterRegistrationBean<WebStatFilter>(new WebStatFilter());
        // 添加过滤规则.
        filterRegistrationBean.addUrlPatterns("/*");
        // 添加不需要忽略的格式信息.
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }

}
