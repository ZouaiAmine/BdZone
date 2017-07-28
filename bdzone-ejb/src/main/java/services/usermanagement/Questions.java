package services.usermanagement;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Question;

/**
 * Session Bean implementation class Questions
 */
@Stateless
@LocalBean
public class Questions implements QuestionsRemote, QuestionsLocal {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	private EntityManager entityManager ;
	
    public Questions() {
        // TODO Auto-generated constructor stub
    }
    
    public void addQuestion(Question question) {
    	entityManager.persist(question);
    }
    
    public void updateQuestion(Question question) {
    	entityManager.merge(question);
    }
    
    public void deleteQuestion(Question question) {
    	entityManager.remove(question);
    }

    
}
