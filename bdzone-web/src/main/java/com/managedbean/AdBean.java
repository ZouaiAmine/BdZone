package com.managedbean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import entities.Trainee;
import services.adminmanagement.AdminManagementRemote;

@ManagedBean
@RequestScoped
public class AdBean implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@EJB
	AdminManagementRemote adminManagementRemote;
	
	private Trainee trainee ;
	private List<Trainee> trainess ;
	
	
	@PostConstruct
	public void init() {
		
	}
	
	public Trainee search() {
		
		return adminManagementRemote.chercherTraineeParId(trainee.getId());
		
	}

	public Trainee getTrainee() {
		return trainee;
	}

	public void setTrainee(Trainee trainee) {
		this.trainee = trainee;
	}

	public List<Trainee> getTrainess() {
		return trainess;
	}

	public void setTrainess(List<Trainee> trainess) {
		this.trainess = trainess;
	}
	
	

}
