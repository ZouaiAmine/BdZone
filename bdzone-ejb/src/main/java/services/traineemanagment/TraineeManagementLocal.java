package services.traineemanagment;

import javax.ejb.Local;

import entities.Question;

@Local
public interface TraineeManagementLocal {

	Question chercherQuestionParId(int id);

	void ajouterQuestion(Question question);

	String modifierQuest(Question question);

}
