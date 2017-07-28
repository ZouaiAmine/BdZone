package services.usermanagement;

import javax.ejb.Local;

import entities.Admin;
//import entities.User;
import entities.User;

@Local
public interface LoginLocal {

	User identifierUser(String login, String password);
}
