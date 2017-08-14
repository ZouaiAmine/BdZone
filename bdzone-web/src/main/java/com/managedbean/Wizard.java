package com.managedbean;


import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.FlowEvent;

import entities.Question;
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
    private boolean skip;
    
    @EJB
     QuestionsRemote questionsRemote ;
   
     
    public void save() {        
        FacesMessage msg = new FacesMessage("Successful", "Welcome :" + question.getTrainee().getFirstName());
        FacesContext.getCurrentInstance().addMessage(null, msg);
        
    }
    
    public void askQuestion() {
    	
		Question qtion= new Question() ;
		//qtion.setIdQuestion(idQtion);
	//	qtion.setTrainee(trainee);
	//	qtion.setType(type);
		//qtion.setCategory(category);
		qtion.setDescriptionQ(descriptionQ);
		//qtion.setTrainee(getTrainee());
		questionsRemote.addQuestion(qtion); 
		
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
}