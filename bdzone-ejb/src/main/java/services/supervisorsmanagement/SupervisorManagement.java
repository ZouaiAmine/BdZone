package services.supervisorsmanagement;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import entities.Answer;
import entities.Keyword;
import entities.Question;


/**
 * Session Bean implementation class SupervisorManagement
 */
@Stateless
@LocalBean
public class SupervisorManagement implements SupervisorManagementRemote, SupervisorManagementLocal {

    /**
     * Default constructor. 
     */
    public SupervisorManagement() {
        // TODO Auto-generated constructor stub
    }

    
    
    @PersistenceContext(unitName="bdzone-ejb")
   	EntityManager entityManager ;
       
       
       @Override
   	public void ajouterAnswer(Answer answer) {
   		
   		 entityManager.persist(answer);
   	}

   	@Override
   	public String modifierAnswer(Answer answer) {

   		entityManager.merge(answer);
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

       
   	

	}
    
    
    
    
