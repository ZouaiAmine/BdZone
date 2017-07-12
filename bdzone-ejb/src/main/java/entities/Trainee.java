package entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Trainee
 *
 */
@Entity

public class Trainee implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_Tr;
	private String usernameTr;
	private String passwordTr;
	private static final long serialVersionUID = 1L;

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	@OneToMany(mappedBy="trainee")
	private List<Question> questions ;
	
	
	
	public Trainee() {
		super();
	}

	public int getId_Tr() {
		return this.id_Tr;
	}

	public void setId_Tr(int id_Tr) {
		this.id_Tr = id_Tr;
	}

	public String getUsernameTr() {
		return this.usernameTr;
	}

	public void setUsernameTr(String usernameTr) {
		this.usernameTr = usernameTr;
	}

	public String getPasswordTr() {
		return this.passwordTr;
	}

	public void setPasswordTr(String passwordTr) {
		this.passwordTr = passwordTr;
	}

}
