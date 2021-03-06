package xin.ewenlai.news.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import xin.ewenlai.news.pojo.User;

/**
 * description : 用户访问数据库接口。
 *
 * @author lwwen
 * date : 2018-07-11 20:09
 * @version 0.0.1
 */
public interface UserDAO extends JpaRepository<User, String> {
    User findByNameAndPassword(String name, String password);

    User findByName(String name);

    boolean existsByName(String name);
}
