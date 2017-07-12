package test.questions;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import entities.Question;
import entities.Trainee;
import services.usermanagement.QuestionsRemote;



public class AddQuestion {

	public static void main(String[] args) throws NamingException{

		Context context = new InitialContext();
		QuestionsRemote questionsRemote = (QuestionsRemote) context
				.lookup("bdzone-ear/bdzone-ejb/Questions!services.usermanagement.QuestionsRemote");

		Trainee zou =new Trainee();
		//zou.setId_Tr(1);
	//	zou.setUsernameTr("hh");
		Question question = new Question();
		//question.setTrainee(zou);
		//question.setIdQuestion(10);
		
		
		questionsRemote.addQuestion(question);
		
		
	}

}
