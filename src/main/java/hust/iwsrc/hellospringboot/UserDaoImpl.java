package hust.iwsrc.hellospringboot;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import hust.iwsrc.dao.User;
import hust.iwsrc.dao.UserDao;

/** 
 * @author: Yiwen Liang[ywhuak@163.com]
 * @date: Created on 19:37 2018/5/5 
 * @Description:  
 */

@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
	@Override
	public void insertUser(User user) {
        String sql = "insert into stu(id,name)values(?,?)";
        Object args[] = {user.getId(),user.getUsername()}; 

        jdbcTemplate.update(sql, args);
	}
	
	@Override
	public List<Map<String, Object>> selectUser() {
        String sql = "select * from stu";

        return jdbcTemplate.queryForList(sql);
	}

}
