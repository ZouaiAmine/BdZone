package services.usermanagement;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import entities.CategoryType;
import entities.Keyword;
import entities.Question;

/**
 * Session Bean implementation class Questions
 */
@Stateless
public class Questions implements QuestionsRemote {

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

    @Override
	public List<Keyword> findKeywordByDescription(Keyword keyword) {
		TypedQuery<Keyword> query = entityManager.createQuery("Select l from Keyword l where l.description=:n", Keyword.class);
		query.setParameter("n", keyword.getDescription());

		return query.getResultList();
	}

	@Override
	public List<Question> findquestionByKeyword(String keyword) {
		TypedQuery<Question> query = entityManager.createQuery("Select l from Question l where l.kword=:n", Question.class);
		query.setParameter("n",keyword);

		return query.getResultList();
	}

	@Override
	public List<Question> findquestionByCategType(CategoryType type) {
		TypedQuery<Question> query = entityManager.createQuery("Select l from Question l where l.type=:n", Question.class);
		query.setParameter("n",type);

		return query.getResultList();
	}
    
}
