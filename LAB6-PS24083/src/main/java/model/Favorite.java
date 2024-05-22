package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name ="FAVORITE",uniqueConstraints = {
		@UniqueConstraint(columnNames = {"videoid","userid"})
})
public class Favorite implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	@ManyToOne @JoinColumn(name="userid")
	Users user;
	
	@ManyToOne @JoinColumn(name="videoid")
	Video video;
	
	@Temporal(TemporalType.DATE)
	Date likedate = new Date();
	
	public Favorite() {
		super();
	}
	
	
	
	public Favorite(long id, Users user, Video video, Date likedate) {
		super();
		this.id = id;
		this.user = user;
		this.video = video;
		this.likedate = likedate;
	}



	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Video getVideo() {
		return video;
	}
	public void setVideo(Video video) {
		this.video = video;
	}
	public Date getLikedate() {
		return likedate;
	}
	public void setLikedate(Date likedate) {
		this.likedate = likedate;
	}
	
	
}