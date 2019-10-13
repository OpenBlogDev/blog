package bonc.com.cn.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@ConfigurationProperties(prefix = "my")
public class Blog {

    private String name;

}
