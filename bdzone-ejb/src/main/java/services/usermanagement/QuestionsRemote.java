package services.usermanagement;

import java.util.List;

import javax.ejb.Remote;

import entities.CategoryType;
import entities.Keyword;
import entities.Question;

@Remote
public interface QuestionsRemote {
	  public void addQuestion(Question question);

	List<Question> findquestionByCategType(CategoryType type);

	List<Question> findquestionByKeyword(String keyword);

	List<Keyword> findKeywordByDescription(Keyword keyword);

}
