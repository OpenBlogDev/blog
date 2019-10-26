package bonc.com.cn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@Entity(name = "bonc_blog")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "blog_name", nullable = false, columnDefinition = " varchar(50) COMMENT '标题' ")
    private String name;

    @Column(name = "blog_author", nullable = false, columnDefinition = "char(20) COMMENT '作者' ")
    private String author;

}
