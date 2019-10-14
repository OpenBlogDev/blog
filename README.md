# blog
个人博客
技术栈：
Spring Boot / Spring MVC / Spring Data Jpa
Java8
Logback
Lombok
功能列表：
认证方式： Basic、 Cookie、Header、内外网
统一错误处理、统一Json格式模板
接口请求日志统一处理
接口频次拦截
支持多数据源、主从分离
多Profile支持，Spring、应用程序Profile整合
完善的系统监控
热部署
自动生成接口文档
环境配置
区分有三种环境dev、test、prod，不同环境会加载不同的配置文件

Spring环境变量: application.yaml或application.properties里配置spring.profiles.active
应用内获取环境变量: spring注入: @Autowired Environment env 或手动解析spring配置文件（不依赖Spring）
数据源配置
手动安装: redis: ip:127.0.0.1 port:6379 password:无
可执行jar包
java -jar deploy/build/libs/deploy-${version}.jar
./deploy/build/libs/deploy-${version}.jar 如需配置JVM等参数请修复deploy/config/deploy-${version}.conf并拷贝到可执行jar包相同目录，并修改${version}
运行项目方式
执行运行: Application.java

监控
健康检查： http://localhost:7002/health
次数监控： http://localhost:7002/metrics
APP信息： http://localhost:7002/info
dump信息： http://localhost:7002/dump
环境信息： http://localhost:7002/env
性能监控： http://localhost:8080/javasimon
数据库监控： http://localhost:8080/druid
Tomcat监控： http://localhost:7002/jolokia/read/Tomcat:type=Connector,port=8080
接口文档
swagger: http://localhost:8080/swagger-ui.html
TODO
完善注释
完善文档
添加单元测试、集成测试、压力测试
