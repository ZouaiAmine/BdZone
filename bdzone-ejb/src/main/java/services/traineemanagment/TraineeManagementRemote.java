package services.traineemanagment;

import java.util.List;

import javax.ejb.Remote;

import entities.Keyword;
import entities.Question;

@Remote
public interface TraineeManagementRemote {

	void ajouterQuestion(Question question);

	

	String modifierQuest(Question question);



	Question chercherQuestionParId(int id);



	List<Keyword> findKeywordByDescription(Keyword keyword);

}
