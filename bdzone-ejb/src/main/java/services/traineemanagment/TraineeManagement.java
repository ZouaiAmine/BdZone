package services.traineemanagment;

import java.util.List;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;


import entities.Keyword;
import entities.Question;


/**
 * Session Bean implementation class TraineeManagement
 */
@Stateless
public class TraineeManagement implements TraineeManagementRemote{

    /**
     * Default constructor. 
     */
    public TraineeManagement() {
        // TODO Auto-generated constructor stub
    }

    @PersistenceContext(unitName="bdzone-ejb")
	EntityManager entityManager ;
    
    
    @Override
	public void ajouterQuestion(Question question) {
		
		 entityManager.persist(question);
	}

	@Override
	public String modifierQuest(Question question) {

		entityManager.merge(question);
		return "success";

	}

		@Override
		public Question chercherQuestionParId(int id) {

		return entityManager.find(Question.class, id);

	}
//
	@Override
	public List<Keyword> findKeywordByDescription(Keyword keyword) {
		TypedQuery<Keyword> query = entityManager.createQuery("Select l from Keyword l where l.description=:n", Keyword.class);
		query.setParameter("n", keyword.getDescription());

		return query.getResultList();
	}

	
	@Override
	public List<Question> afficherQuestions() {
		TypedQuery<Question> query =  entityManager.createQuery("select h from Question h", Question.class);
		return query.getResultList();
	}
	
	@Override
	public List<Question> afficherQuestions2() {
		TypedQuery<Question> query =  entityManager.createQuery("select h from Question h", Question.class);
		return query.getResultList();
	}


    
    
}
