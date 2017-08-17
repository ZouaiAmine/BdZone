package com.managedbean;


import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.FlowEvent;

import entities.Answer;
import entities.AnswerPK;
import entities.CategoryType;
import entities.Keyword;
import entities.Question;
import entities.Trainee;
import services.usermanagement.QuestionsRemote;

 
@ManagedBean
@ViewScoped
public class Wizard implements Serializable {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Question question = new Question();
     private String descriptionQ ;
     private Trainee trainee ;
     private List<Answer> answers ;
     private Answer answer ;
     private String kword ;
    private String fname ;
     private int idTrainee ;
     private Keyword keyword ;
     
    private boolean skip;
    private CategoryType type ;
   
    @EJB
     QuestionsRemote questionsRemote ;
   
     
    public void save() {        
        FacesMessage msg = new FacesMessage("Successful", "Welcome :" + question.getTrainee().getFirstName());
        FacesContext.getCurrentInstance().addMessage(null, msg);
        
    }
    
    public void askQuestion() {
    	
		Question qtion= new Question() ;
		//qtion.setIdQuestion(idQtion);
		Trainee traineeee = new Trainee() ;
	traineeee.setFirstName(fname);
	traineeee.setId(idTrainee);
	qtion.setTrainee(traineeee);
		qtion.setType(type);
		//qtion.setAnswers(answers);
		qtion.setAnswer(answer);
		qtion.setKword(kword);
		//qtion.setCategory(category);
		qtion.setDescriptionQ(descriptionQ);
		//qtion.setTrainee(getTrainee());
		
		questionsRemote.addQuestion(qtion); 
		
	}
    
    public void execute() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Executed", "Using RemoteCommand."));
    } 
    
    public boolean isSkip() {
        return skip;
    }
 
    public void setSkip(boolean skip) {
        this.skip = skip;
    }
     
    public String onFlowProcess(FlowEvent event) {
        if(skip) {
            skip = false;   //reset in case user goes back
            return "confirm";
        }
        else {
            return event.getNewStep();
        }
    }

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public String getDescriptionQ() {
		return descriptionQ;
	}

	public void setDescriptionQ(String descriptionQ) {
		this.descriptionQ = descriptionQ;
	}

	public Trainee getTrainee() {
		return trainee;
	}

	public void setTrainee(Trainee trainee) {
		this.trainee = trainee;
	}

	

	public void setType(CategoryType type) {
		this.type = type;
	}

	public CategoryType getType() {
		return type;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public Keyword getKeyword() {
		return keyword;
	}

	public void setKeyword(Keyword keyword) {
		this.keyword = keyword;
	}

	

	public String getKword() {
		return kword;
	}

	public void setKword(String kword) {
		this.kword = kword;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public int getIdTrainee() {
		return idTrainee;
	}

	public void setIdTrainee(int idTrainee) {
		this.idTrainee = idTrainee;
	}




}