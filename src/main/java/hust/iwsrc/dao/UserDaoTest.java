package hust.iwsrc.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import hust.iwsrc.App;
import hust.iwsrc.hellospringboot.UserDaoImpl;

/** 
 * @author: Yiwen Liang[ywhuak@163.com]
 * @date: Created on 18:49 2018/5/5 
 * @Description:  
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
public class UserDaoTest {

	@Test
	public void test() {
        User user = new User();
        user.setId(1223123412);
        UserDao userDao = new UserDaoImpl();
        userDao.insertUser(user);
	}

}
