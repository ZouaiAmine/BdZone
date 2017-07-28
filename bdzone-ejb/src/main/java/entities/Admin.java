package entities;

import entities.User;
import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Admin
 *
 */
@Entity
@DiscriminatorValue(value="Admin")
public class Admin extends User implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@OneToMany(mappedBy="administrateur")
	private List<Question> questions ;
	
	
	@OneToMany(mappedBy="administrateur")
	private List<Category> categories ;
	
	
	
	public Admin() {
		super();
	}
   
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

	
}
