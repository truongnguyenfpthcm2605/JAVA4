package com.poly.ps24083.util;

import java.util.Date;

public class Staff {
	public String fullname;
	public double salary;
	public String[] hobbies;
	public int age;
	public boolean gender;
	public int select;
	public String file;
	public Date birthday;
	
	
	


	public Staff() {
		
	}

	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String[] getHobbies() {
		return hobbies;
	}


	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public boolean isGender() {
		return gender;
	}


	public void setGender(boolean gender) {
		this.gender = gender;
	}


	public int getSelect() {
		return select;
	}


	public void setSelect(int select) {
		this.select = select;
	}


	public String getFile() {
		return file;
	}


	public void setFile(String file) {
		this.file = file;
	}
	

	
	
}
