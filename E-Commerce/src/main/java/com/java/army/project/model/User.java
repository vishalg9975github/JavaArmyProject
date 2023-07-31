package com.java.army.project.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "userdetails")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String username;
	private String realName;
	private String password;
	private String gender;
<<<<<<< HEAD
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSSSSS")
	private Date birthday;
	private String userType;

=======
	private Date birthday;
	private String userType;
	public User(Integer id, String username, String realName, String password, String gender, Date birthday,
			String userType) {
		super();
		this.id = id;
		this.username = username;
		this.realName = realName;
		this.password = password;
		this.gender = gender;
		this.birthday = birthday;
		this.userType = userType;
	}
>>>>>>> f54836f84f5c8c21000e5243e2eefc5ac6bfee41
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
<<<<<<< HEAD

	public String getGender() {
		return gender;
	}

=======
	public String getGender() {
		return gender;
	}
>>>>>>> f54836f84f5c8c21000e5243e2eefc5ac6bfee41
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
<<<<<<< HEAD

	public String getUserType() {
		return userType;
	}

=======
	public String getUserType() {
		return userType;
	}
>>>>>>> f54836f84f5c8c21000e5243e2eefc5ac6bfee41
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", realName=" + realName + ", password=" + password
				+ ", gender=" + gender + ", birthday=" + birthday + ", userType=" + userType + "]";
	}

	

	
	
}
