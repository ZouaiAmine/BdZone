package com.managedbean;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import javax.faces.bean.ViewScoped;

import entities.SuperVisor;
import services.adminmanagement.AdminManagementRemote;



@ManagedBean
@ViewScoped
public class SupervisorMB implements Serializable {

	@EJB
	AdminManagementRemote adminManagementRemote;

	private List<SuperVisor> superVisors;

	@ManagedProperty(value = "#{CategoryMB}")
	private CategoryMB gererCateg ;

	private Boolean renderList;
	private Boolean renderAddForm;
	private SuperVisor superVisor;
	private Boolean renderUpdateForm;
/*
	public GererLaboBean getGererLabo() {
		return gererLabo;
	}

	public void setGererLabo(GererLaboBean gererLabo) {
		this.gererLabo = gererLabo;
	}

*/
	
	@PostConstruct
	public void init() {
		System.out.println("new gererEmplBean!!!!!!!!!!!!!!!!");
		//superVisors = new ArrayList<SuperVisor>();
		//superVisor = new SuperVisor();
		System.out.println("id supervisor " + gererCateg.getCategory().getId_Catg());
		superVisors = adminManagementRemote.listerSupervisorsCateg(gererCateg.getCategory());
		renderAddForm = false;
		setRenderUpdateForm(false);
		if (superVisors.isEmpty()) {
			renderList = false;
			System.out.println("is empty!!!!!!!!!!!!");

		} else {
			renderList = true;

		}
	}


	
	public String demissionner(SuperVisor superVisor) {
		System.out.println("in !!!!!");
		System.out.println("employe "+superVisor.getFirstName());
		adminManagementRemote.demissionnerSupervisor(superVisor,gererCateg.getCategory());;

		return "/User/admin/listSupervisors?faces-redirect=true";
	}
	
	public String update() {
		System.out.println("cin  "+superVisor.getFirstName());
		adminManagementRemote.modifierSupervisor(superVisor);

		return "/User/admin/listSupervisors?faces-redirect=true";
	}
	
	
	public String ajouter() {
		adminManagementRemote.affecterSupervisorCategory(superVisor,gererCateg.getCategory());

		return "/User/admin/listSupervisors?faces-redirect=true";
	}




	public List<SuperVisor> getSuperVisors() {
		return superVisors;
	}

	public void setSuperVisors(List<SuperVisor> superVisors) {
		this.superVisors = superVisors;
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


	public CategoryMB getGererCateg() {
		return gererCateg;
	}


	public void setGererCateg(CategoryMB gererCateg) {
		this.gererCateg = gererCateg;
	}

}

