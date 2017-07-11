package entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Question
 *
 */
@Entity

public class Question implements Serializable {

	   
	@Id
	private int idQuestion;
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private Trainee trainee ;
	
	@ManyToOne
	private Category category ;
	
	@ManyToOne
	private Admin administrateur ;
	
	@OneToMany(mappedBy="question")
	private List<Answer> answers ;
	
	@ManyToOne
	private SuperVisor superVisor ;
	
	
	public Question() {
		super();
	}   
	public int getIdQuestion() {
		return this.idQuestion;
	}

	public Trainee getTrainee() {
		return trainee;
	}
	public void setTrainee(Trainee trainee) {
		this.trainee = trainee;
	}

	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public Admin getAdministrateur() {
		return administrateur;
	}
	public void setAdministrateur(Admin administrateur) {
		this.administrateur = administrateur;
	}
	
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	
	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}
   
}
