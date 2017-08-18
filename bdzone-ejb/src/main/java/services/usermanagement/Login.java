package services.usermanagement;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import entities.Trainee;
import entities.User;




/**
 * Session Bean implementation class Login
 */
@Stateless
public class Login implements LoginRemote, LoginLocal {

	@PersistenceContext(unitName="bdzone-ejb")
	EntityManager entityManager ;
	
	public Login() {
        // TODO Auto-generated constructor stub
	}
	
	@Override
	public User identifierUser(String login, String password) {
		User user = null;
		String requete = "select e from User e where e.login=:x and e.password=:y ";
		try {
			user = entityManager.createQuery(requete, User.class).setParameter("x", login)
					.setParameter("y", password)
					.getSingleResult();
			System.out.println("te5dem");
			
		} catch (NoResultException ex) {
			System.out.println("aucun objet avec ce login et ce mdp");
		}

		return user;
	}
	
	@Override
	public void DisableAccount(User u){
		u.setBaned(true);
		entityManager.merge(u);
		
	}
	
	@Override
	public void DeleteTrainee(Trainee trainee) {

		entityManager.remove(entityManager.merge(trainee));

	}
	

}
