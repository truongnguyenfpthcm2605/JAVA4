package model;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.OneToMany;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@NamedQueries({		
	@NamedQuery(name = "Video.findByKeyword", 
			query = "SELECT  f.video FROM Favorite f WHERE f.video.title LIKE :keyword "),
		
		@NamedQuery(name = "Video.findByUser", 
				query = "SELECT o.video FROM Favorite o WHERE o.user.id = :id"),
		
		@NamedQuery(name = "Video.findInRange", 
				query = "SELECT   o.video FROM Favorite o WHERE o.likedate BETWEEN :min AND :max"),

		@NamedQuery(name = "Video.findInMotnhs",
				query = "SELECT  o.video FROM Favorite o  WHERE month(o.likedate) IN (:months)")
		
 })
@NamedNativeQueries({
	@NamedNativeQuery(name = "Video.random10",
			query = "SELECT TOP 10 * FROM VIDEO ORDER BY newId()",
			resultClass =  Video.class),

	
})
@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(
			name = "spFavoriteByYear",
			procedureName = "spFavoriteByYear",
			resultClasses = { Report.class },
			parameters = @StoredProcedureParameter(name = "Year", type = Integer.class) 
			
	)
})

@Entity
@Table(name = "VIDEO")
public class Video {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String title;
	String poster;
	String descriptions;
	boolean active = false;
	int views;

	@OneToMany(mappedBy = "video")
	List<Favorite> favorites;
	
	public Video() {
		super();
		
	}
	

	public Video(int id, String title, String poster, String descriptions, boolean active, int views,
			List<Favorite> favorites) {
		super();
		this.id = id;
		this.title = title;
		this.poster = poster;
		this.descriptions = descriptions;
		this.active = active;
		this.views = views;
		this.favorites = favorites;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public List<Favorite> getFavorites() {
		return favorites;
	}

	public void setFavorites(List<Favorite> favorites) {
		this.favorites = favorites;
	}

}
