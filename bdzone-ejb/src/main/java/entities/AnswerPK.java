package entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class AnswerPK implements Serializable{

	private int idSupervisor ;
	private int idQuestion ;
	
	
	
	
	public int getIdSupervisor() {
		return idSupervisor;
	}
	public void setIdSupervisor(int idSupervisor) {
		this.idSupervisor = idSupervisor;
	}
	public int getIdQuestion() {
		return idQuestion;
	}
	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idQuestion;
		result = prime * result + idSupervisor;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AnswerPK other = (AnswerPK) obj;
		if (idQuestion != other.idQuestion)
			return false;
		if (idSupervisor != other.idSupervisor)
			return false;
		return true;
	}

	
	
	
}
