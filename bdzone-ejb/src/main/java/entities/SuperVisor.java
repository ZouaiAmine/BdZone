package entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: SuperVisor
 *
 */
@Entity

public class SuperVisor implements Serializable {

	   
	@Id
	private int id_SV;
	private String username;
	private String password;
	private static final long serialVersionUID = 1L;

	@ManyToMany(mappedBy="superVisors")
	private List<Category> categories ;

	@OneToMany(mappedBy="superVisor")
	private List<Answer> answers ;
	
	@OneToMany(mappedBy="superVisor",cascade = CascadeType.ALL)
	private List<Question> questions ;
	
	
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	public List<Category> getCategories() {
		return categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	
	
	public SuperVisor() {
		super();
	}   
	public int getId_SV() {
		return this.id_SV;
	}

	public void setId_SV(int id_SV) {
		this.id_SV = id_SV;
	}   
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
   
}
