package services.adminmanagement;

import java.util.List;

import javax.ejb.Remote;

import entities.Category;
import entities.CategoryType;
import entities.Question;
import entities.SuperVisor;
import entities.Trainee;
import entities.User;

@Remote
public interface AdminManagementRemote {

	Category ajouterCateg(Category category);

	String modifierCateg(Category category);

	Category chercherCategParId(int id);

	List<Category> chercherCategParNom(String nom);

	String affecterSupervisorCategory(SuperVisor superVisor, Category category);

	List<SuperVisor> listerSupervisorsCateg(Category category);
	void ajouterCate(Category category);

	SuperVisor modifierSupervisor(SuperVisor superVisor);

	void demissionnerSupervisor(SuperVisor superVisor, Category category);

	void ajouterUser(User user);

	List<SuperVisor> afficherSuperVisor();

	void ajouterTrainee(Trainee user);

	List<Trainee> afficherTrainees();

	Trainee modifierTainee(Trainee trainee);

	Trainee chercherTraineeParId(int id);

	SuperVisor chercherSuperVisorParId(int id);

	void ajouterSupervisor(SuperVisor superVisor);

	void DisableAccount(SuperVisor u);

	void updatee(Trainee trainee);

	List<Question> listerQuestionByCateg(CategoryType categoryType);

	List<Question> afficherQuestions();
}
