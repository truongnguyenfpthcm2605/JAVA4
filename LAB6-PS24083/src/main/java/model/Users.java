package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class Users  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String password;
	String PHONE;
	String fullname;
	String email;
	boolean admin = false;
	
	@OneToMany(mappedBy = "user")
	List<Favorite> favorites;
	
	
	public Users() {
		super();
	}
	
	

	public Users(int id, String password, String pHONE, String fullname, String email, boolean admin,
			List<Favorite> favorites) {
		super();
		this.id = id;
		this.password = password;
		PHONE = pHONE;
		this.fullname = fullname;
		this.email = email;
		this.admin = admin;
		this.favorites = favorites;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPHONE() {
		return PHONE;
	}

	public void setPHONE(String pHONE) {
		PHONE = pHONE;
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

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public List<Favorite> getFavorites() {
		return favorites;
	}

	public void setFavorites(List<Favorite> favorites) {
		this.favorites = favorites;
	}
	
	
	
}
