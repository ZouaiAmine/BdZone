package services.usermanagement;

import javax.ejb.Remote;

import entities.Question;

@Remote
public interface QuestionsRemote {
	  public void addQuestion(Question question);

}
