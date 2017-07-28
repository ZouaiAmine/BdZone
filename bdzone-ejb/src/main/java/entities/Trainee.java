package entities;

import entities.User;
import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Trainee
 *
 */
@Entity
@DiscriminatorValue(value="Trainee")
public class Trainee extends User implements Serializable {

	
	private String university;
	private static final long serialVersionUID = 1L;


	@OneToMany(mappedBy="trainee")
	private List<Question> questions ;

	
	public Trainee() {
		super();
	}
	
	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	
	public String getUniversity() {
		return this.university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}
   
}
