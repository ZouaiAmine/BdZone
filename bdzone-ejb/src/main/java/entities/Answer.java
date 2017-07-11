package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Answer
 *
 */
@Entity

public class Answer implements Serializable {

	@EmbeddedId
	private AnswerPK answerPK ;
	private Date date;
	private static final long serialVersionUID = 1L;


	@ManyToOne
	@JoinColumn(name="idSuperVisor",referencedColumnName="id_SV",insertable=false,updatable=false)
	private SuperVisor superVisor ;

	@ManyToOne
	@JoinColumn(name="idQuestion",referencedColumnName="idQuestion",insertable=false,updatable=false)
	private Question question ;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((answerPK == null) ? 0 : answerPK.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
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
		Answer other = (Answer) obj;
		if (answerPK == null) {
			if (other.answerPK != null)
				return false;
		} else if (!answerPK.equals(other.answerPK))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		return true;
	}
	public Answer() {
		super();
	}   
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	public AnswerPK getAnswerPK() {
		return answerPK;
	}
	public void setAnswerPK(AnswerPK answerPK) {
		this.answerPK = answerPK;
	}
	public SuperVisor getSuperVisor() {
		return superVisor;
	}
	public void setSuperVisor(SuperVisor superVisor) {
		this.superVisor = superVisor;
	}
	
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	
	
	
}
   
