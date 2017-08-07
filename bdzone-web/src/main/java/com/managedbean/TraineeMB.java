package com.managedbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import entities.SuperVisor;
import entities.Trainee;
import services.adminmanagement.AdminManagementRemote;

@ManagedBean
@RequestScoped
public class TraineeMB implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@EJB
	AdminManagementRemote adminManagementRemote;
	
	private List<Trainee> trainees;
	//Trainee trainee;
	//@ManagedProperty(value = "#{CategoryMB}")
//	private CategoryMB gererCateg ;

	private Boolean renderList;
	private Boolean renderAddForm;
	private SuperVisor superVisor;
	private Boolean renderUpdateForm;

	
	@PostConstruct
	public void init() {
		System.out.println("new gererEmplBean!!!!!!!!!!!!!!!!");
		
		trainees = adminManagementRemote.afficherTrainees();
		renderAddForm = false;
		setRenderUpdateForm(false);
		if (trainees.isEmpty()) {
			renderList = false;
			System.out.println("is empty!!!!!!!!!!!!");

		} else {
			renderList = true;

		}
	}


	
//	public String stageTerminer(Trainee trainee) {
//		System.out.println("in !!!!!");
//		System.out.println("trainee "+trainee.getFirstName());
//		
//
//		return "/User/admin/listSupervisors?faces-redirect=true";
//	}
	
//	public String update() {
//	
//		System.out.println("name : "+trainee.getFirstName());
//		adminManagementRemote.modifierTainee(trainee);
//
//		return "/User/admin/userList?faces-redirect=true";
//	}
	
//	public String ajouterTrainee() {
//		
//		adminManagementRemote.ajouterTrainee(trainee);
//		return "/User/admin/userList?faces-redirect=true";
//	}
//	
//	
	
	public List<Trainee> getTrainees() {
		return trainees;
	}


	public void setTrainees(List<Trainee> trainees) {
		this.trainees = trainees;
	}


	public Boolean getRenderList() {
		return renderList;
	}


	public void setRenderList(Boolean renderList) {
		this.renderList = renderList;
	}


	public Boolean getRenderAddForm() {
		return renderAddForm;
	}


	public void setRenderAddForm(Boolean renderAddForm) {
		this.renderAddForm = renderAddForm;
	}


	public SuperVisor getSuperVisor() {
		return superVisor;
	}


	public void setSuperVisor(SuperVisor superVisor) {
		this.superVisor = superVisor;
	}


	public Boolean getRenderUpdateForm() {
		return renderUpdateForm;
	}


	public void setRenderUpdateForm(Boolean renderUpdateForm) {
		this.renderUpdateForm = renderUpdateForm;
	}

}
