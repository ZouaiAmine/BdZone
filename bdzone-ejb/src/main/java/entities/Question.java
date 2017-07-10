package entities;

import java.io.Serializable;
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

	public Question() {
		super();
	}   
	public int getIdQuestion() {
		return this.idQuestion;
	}

	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}
   
}
