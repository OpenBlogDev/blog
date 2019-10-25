package bonc.com.cn.config.datasource;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@Profile("dev")
public class DataSourceConfigDev {
	
	@Bean
	public DataSource myDataSource() {
		DruidDataSource druidDataSource = new  DruidDataSource();
		druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		druidDataSource.setUrl("jdbc:mysql://172.16.3.47:31885/pdm?characterEncoding=utf-8&autoReconnect=true&useSSL=false");
		druidDataSource.setUsername("root");
		druidDataSource.setPassword("LxQrCv8L");
		//druidDataSource.setInitialSize();
		return druidDataSource; 
		
	}
}
