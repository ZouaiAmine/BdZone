package com.managedbean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entities.Category;
import services.adminmanagement.AdminManagementRemote;


@ManagedBean
@SessionScoped
public class CategoryMB implements Serializable {

	private Category category;
	@EJB
	AdminManagementRemote adminManagementRemote;

	@PostConstruct
	public void init() {
		category = new Category();
	}

	public String ajouterLabo() {
		category = adminManagementRemote.ajouterCateg(category);
		return "/admin/listeEmploye?faces-redirect=true";

	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	

}
