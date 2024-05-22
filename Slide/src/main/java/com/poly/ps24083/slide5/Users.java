package com.poly.ps24083.slide5;

import java.io.Serializable;
import javax.persistence.*;


//@Entity
//@Table(name = "USERS")
public class Users implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	String id;
	
	@Column(name = "PASSWORD")
	String password;
	
	@Column(name = "FULLNAME")
	String fullname;
	
	@Column(name = "EMAIL")
	String email;
	
	@Column(name = "ADMIN")
	Boolean admin;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="IDCLASS",columnDefinition="INTEGER")
	Class idclass;
	
	
	
	public Class getIdclass() {
		return idclass;
	}
	public void setIdclass(Class idclass) {
		this.idclass = idclass;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getAdmin() {
		return admin;
	}
	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}
	
	

}
