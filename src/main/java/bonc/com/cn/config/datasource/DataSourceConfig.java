package bonc.com.cn.config.datasource;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@Profile("dev")
public class DataSourceConfig {
	
	@Bean
	public DataSource myDataSource() {
		DruidDataSource druidDataSource = new  DruidDataSource();
		druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		druidDataSource.setUrl("jdbc:mysql://localhost:3306/blog?characterEncoding=utf-8&autoReconnect=true&useSSL=false");
		druidDataSource.setUsername("root");
		druidDataSource.setPassword("root");
		return null; 
		
	}
}
