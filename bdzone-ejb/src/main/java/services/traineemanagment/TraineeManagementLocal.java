package services.traineemanagment;

import java.util.List;

import javax.ejb.Local;

import entities.Question;

@Local
public interface TraineeManagementLocal {

	Question chercherQuestionParId(int id);

	void ajouterQuestion(Question question);

	String modifierQuest(Question question);

	List<Question> afficherQuestions();
}
