package hust.iwsrc.dao;

import java.util.List;
import java.util.Map;

/** 
 * @author: Yiwen Liang[ywhuak@163.com]
 * @date: Created on 18:40 2018/5/5 
 * @Description:  
 */


public interface UserDao {


	/**
	 * @param user
	 */
	public void insertUser(User user) ;
	

	public List<Map<String, Object>> selectUser() ;
}
