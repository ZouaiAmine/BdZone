package services.usermanagement;

import javax.ejb.Remote;

import entities.Admin;
import entities.Trainee;
import entities.User;

@Remote
public interface LoginRemote {

	User identifierUser(String login, String password);

	void DisableAccount(User u);

	void DeleteTrainee(Trainee trainee);

}
