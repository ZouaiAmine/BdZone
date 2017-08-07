package com.managedbean;


import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import javax.faces.bean.ManagedBean;

import javax.faces.bean.ViewScoped;

import entities.SuperVisor;
import entities.Trainee;

import services.adminmanagement.AdminManagementRemote;



@ManagedBean(name="dtBasicView")
@ViewScoped
public class BasicView   {
	
	//private List<Agent> cars;	
	private List<SuperVisor> superVisors;
	private List<Trainee> trainees;
	
   
    @EJB 
    AdminManagementRemote adminManagementRemote;
    
	

   private Trainee trainee ;
    private SuperVisor superVisor;
    
    
    @PostConstruct
    public void init() {
    	superVisor = new SuperVisor();
      superVisors=new ArrayList<>();
    	superVisors=adminManagementRemote.afficherSuperVisor();
    	
    	trainee = new Trainee();
        trainees=new ArrayList<Trainee>();
      	trainees=adminManagementRemote.afficherTrainees();
    }


	public List<SuperVisor> getSuperVisors() {
		return superVisors;
	}


	public void setSuperVisors(List<SuperVisor> superVisors) {
		this.superVisors = superVisors;
	}


	public SuperVisor getSuperVisor() {
		return superVisor;
	}


	public void setSuperVisor(SuperVisor superVisor) {
		this.superVisor = superVisor;
	}

	public List<Trainee> getTrainees() {
		return trainees;
	}

	public void setTrainees(List<Trainee> trainees) {
		this.trainees = trainees;
	}

	public Trainee getTrainee() {
		return trainee;
	}

	public void setTrainee(Trainee trainee) {
		this.trainee = trainee;
	}
     
    
	
	
//	
//	public String close(SuperVisor u) {
//		u.setBaned(true);
//		adminManagementRemote.closeUser(u);
//		
//		return "";
//	}
//	
//	
//	public String delete(User u) {
//		ser.supprimerUser(u);
//		//init();
//		//return "/User/Agent/UserList?faces-redirect=true";
//		return "";
//	}
}