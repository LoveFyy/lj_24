package com.chinasoft.User.pojo;

import java.util.Date;

public class User {

	private String id;//id
	private String username;//用户名
	private String password;//密码
	private String email;//邮箱
	private String phone;//电话
	private Date add_date;//注册时间
	private int state;//权限
	private String province;//省份
	private String company;//公司
	private String department;//部门
	private int field_id;//文件id
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getAdd_date() {
		return add_date;
	}
	public void setAdd_date(Date add_date) {
		this.add_date = add_date;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getField_id() {
		return field_id;
	}
	public void setField_id(int field_id) {
		this.field_id = field_id;
	}

	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", email=" + email + ", phone=" + phone
				+ ", add_date=" + add_date + ", state=" + state + ", province="
				+ province + ", company=" + company + ", department="
				+ department + ", field_id=" + field_id + "]";
	}
	
	
	
}
