package services.traineemanagment;

import java.util.List;

import javax.ejb.Remote;

import entities.CategoryType;
import entities.Keyword;
import entities.Question;

@Remote
public interface TraineeManagementRemote {

	void ajouterQuestion(Question question);

	

	String modifierQuest(Question question);



	Question chercherQuestionParId(int id);



	List<Keyword> findKeywordByDescription(Keyword keyword);



	List<Question> afficherQuestions();



	List<Question> afficherQuestions2();



	List<Question> findquestionByKeyword(String keyword);



	List<Question> findquestionByCategType(CategoryType type);

}
