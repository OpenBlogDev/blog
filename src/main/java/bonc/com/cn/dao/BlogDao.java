package bonc.com.cn.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import bonc.com.cn.entity.Blog;

public interface BlogDao extends JpaRepository<Blog, Integer> {

}
