package com.atguigu.mvc.entity;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class User {

	//字符串长度在5~10之间
	//非空
	private String userName;
	
	//20~30之间
	private int age;
	
	//Email
	private String email;
	
	//必须是一个过去的时间
	private Date birthday;
	
	//长度在3~5之间
	//非空
	private List<String> multiValues;
	
	public User() {
		
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", age=" + age + ", email="
				+ email + ", birthday=" + birthday + ", multiValues="
				+ multiValues + "]";
	}

	public User(String userName, int age, String email, Date birthday,
			List<String> multiValues) {
		super();
		this.userName = userName;
		this.age = age;
		this.email = email;
		this.birthday = birthday;
		this.multiValues = multiValues;
	}

	public List<String> getMultiValues() {
		return multiValues;
	}

	public void setMultiValues(List<String> multiValues) {
		this.multiValues = multiValues;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
