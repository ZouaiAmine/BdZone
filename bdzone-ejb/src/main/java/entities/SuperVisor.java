package entities;

import entities.User;
import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: SuperVisor
 *
 */
@Entity
@DiscriminatorValue(value="SuperVisor")
public class SuperVisor extends User implements Serializable {

	   
	
	private int experience;
	private static final long serialVersionUID = 1L;

	@ManyToMany
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
	public int getExperience() {
		return this.experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
   
}
