package com.managedbean;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import entities.Admin;
import entities.Category;
import entities.SuperVisor;
import entities.Trainee;
import entities.User;
import services.adminmanagement.AdminManagementRemote;

@ManagedBean
@RequestScoped
public class SubscribtionBean {
     
    private String firstName;
    private String lastName;
    private String eMail;
    private String login;
    private String password;
    private String university;
    private String typeUser ;
    private int experience ;
    private Category category ;
    
    @EJB
    AdminManagementRemote adminManagementRemote ;
    
    
	public String Subscribe() {
		return "/login/auth?faces-redirect=true";
	}
    
    public String register() {
		switch (typeUser) {
		case "User":
			User user = new User(firstName, lastName, eMail);
			//employe.setDateNaissance(dateNaissance);
			user.seteMail(eMail);
			user.setFirstName(firstName);
			user.setLastName(lastName);
			user.setLogin(login);
			user.setPassword(password);
			adminManagementRemote.ajouterUser(user);
			
			break;
		case "SuperVisor":
			SuperVisor superVisor = new SuperVisor();
			superVisor.setFirstName(firstName);
			superVisor.setLastName(lastName);
			superVisor.setLogin(login);
			superVisor.setPassword(password);
			superVisor.setExperience(experience);
			superVisor.setCategory(category);
			
			adminManagementRemote.ajouterUser(superVisor);
			break;
		case "Trainee":
			Trainee trainee = new Trainee();
			trainee.setFirstName(firstName);
			trainee.setLastName(lastName);
			trainee.setLogin(login);
			trainee.setPassword(password);
			trainee.setUniversity(university);
			
			
			adminManagementRemote.ajouterUser(trainee);
			break;
		case "Admin":
			Admin admin = new Admin();
			admin.setFirstName(firstName);
			admin.setLogin(login);
			admin.setPassword(password);
			break;
		default:
			break;
			
		}
		//créer les facesMessages pour chaque validator
		return "/login/auth?faces-redirect=true";
	}

    
    
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getTypeUser() {
		return typeUser;
	}
	public void setTypeUser(String typeUser) {
		this.typeUser = typeUser;
	}



	public int getExperience() {
		return experience;
	}



	public void setExperience(int experience) {
		this.experience = experience;
	}



	public void setCategory(Category category) {
		this.category = category;
	}



	public Category getCategory() {
		return category;
	}





	
 
    
}