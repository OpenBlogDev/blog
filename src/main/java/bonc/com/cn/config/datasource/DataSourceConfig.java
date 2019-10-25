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
		druidDataSource.setUrl("");
		
		
		
		
		
		
		
		
		
		return null; 
		
	}
}
