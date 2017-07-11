package entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Admin
 *
 */
@Entity

public class Admin implements Serializable {

	   
	
	@Id
	private int id_Ad;
	private String passwordAd;
	private String usernameAd ;
	
	@OneToMany(mappedBy="administrateur")
	private List<Question> questions ;
	
	
	@OneToMany(mappedBy="administrateur")
	private List<Category> categories ;
	
	
	private static final long serialVersionUID = 1L;

	public Admin() {
		super();
	}   
	public int getId_Ad() {
		return this.id_Ad;
	}

	public void setId_Ad(int id_Ad) {
		this.id_Ad = id_Ad;
	}   
	public String getPasswordAd() {
		return this.passwordAd;
	}

	public void setPasswordAd(String passwordAd) {
		this.passwordAd = passwordAd;
	}
   
	public String getUsernameAd() {
		return usernameAd;
	}
	public void setUsernameAd(String usernameAd) {
		this.usernameAd = usernameAd;
	}
	/*
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	*/
	public List<Category> getCategories() {
		return categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

}
