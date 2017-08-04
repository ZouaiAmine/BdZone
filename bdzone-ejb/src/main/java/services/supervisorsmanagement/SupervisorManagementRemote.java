package services.supervisorsmanagement;

import java.util.List;

import javax.ejb.Remote;

import entities.Answer;
import entities.Keyword;
import entities.Question;

@Remote
public interface SupervisorManagementRemote {

	Question chercherQuestionParId(int id);



	String modifierAnswer(Answer answer);



	void ajouterAnswer(Answer answer);



	List<Keyword> findKeywordByDescription(Keyword keyword);

}
