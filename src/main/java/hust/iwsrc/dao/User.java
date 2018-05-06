package hust.iwsrc.dao;

import java.io.Serializable;

/** 
 * @author: Yiwen Liang[ywhuak@163.com]
 * @date: Created on 18:42 2018/5/5 
 * @Description:  
 */

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String username;
	private String password;
	private String department;
	private String telphone;
	private String address;
	private String allot_resource;
	
	public String getAllot_resource() {
		return allot_resource;
	}
	public void setAllot_resource(String allot_resource) {
		this.allot_resource = allot_resource;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String userName) {
		this.username = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getDepartment() {
		return department;
	}
	public void setDepartment(String departMent) {
		this.department = departMent;
	}
	public String getTelphone() {
		return telphone;
	}
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+username;
	}
	
}
