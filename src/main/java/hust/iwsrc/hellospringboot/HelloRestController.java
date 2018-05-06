package hust.iwsrc.hellospringboot;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hust.iwsrc.dao.User;
import hust.iwsrc.dao.UserDao;

@RestController
public class HelloRestController {
	
  @Value(value = "${book}")
  private String name;
  
  @Autowired
  private UserDao userDao;
  
  @RequestMapping(value="/addUser" , method= RequestMethod.GET)
  public String hello(@RequestParam("id") Integer id,@RequestParam("name") String name) {
	  
	  User user = new User();
	  user.setId(id);
	  user.setUsername(name);
      userDao.insertUser(user);
      
    return "User: "+ "id: " + id + "name: " + name + "Succeed";
  }
  
  @RequestMapping("/users")
  public List<Map<String, Object>> getUsersList() {
	  
      return userDao.selectUser();
      
  }
  
  @RequestMapping("/hello2")
  public Set<String> hello2() {
	  String[] staffs = new String[]{"Tom", "Bob", "Jane"};
	  Set<String> staffsSet = new HashSet<>(Arrays.asList(staffs));
	  staffsSet.add("Mary"); // ok
	  staffsSet.remove("Tom"); // ok
	  return staffsSet;
  }
}
