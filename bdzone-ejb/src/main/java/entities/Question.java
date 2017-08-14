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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idQuestion;
	
	private String descriptionQ ;
	
	@Enumerated(EnumType.STRING)
	private CategoryType type ;
	
	private static final long serialVersionUID = 1L;
	
	@OneToMany
	private List<Keyword> keywords ;
	
	
	
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
	
	/*
	public Question() {
		super();
	}   */
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

	public String getDescriptionQ() {
		return descriptionQ;
	}

	public void setDescriptionQ(String descriptionQ) {
		this.descriptionQ = descriptionQ;
	}

	public List<Keyword> getKeywords() {
		return keywords;
	}

	public void setKeywords(List<Keyword> keywords) {
		this.keywords = keywords;
	}

	public SuperVisor getSuperVisor() {
		return superVisor;
	}

	public void setSuperVisor(SuperVisor superVisor) {
		this.superVisor = superVisor;
	}

	public CategoryType getType() {
		return type;
	}

	public void setType(CategoryType type) {
		this.type = type;
	}
   
}
