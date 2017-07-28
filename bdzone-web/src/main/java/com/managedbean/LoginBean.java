package com.managedbean;


import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import javax.faces.context.FacesContext;

import entities.Admin;
import entities.SuperVisor;
import entities.Trainee;
import entities.User;
import services.usermanagement.LoginRemote;



@ManagedBean
@SessionScoped
public class LoginBean{


	private String login;
	private String password;
	private  User user;
	//private Principal principal; 
	

//	 @PostConstruct
//	 public void init(){ 
//	  principal =SecurityContextAssociation.getPrincipal(); 
//	  login = principal.getName();
//	  
//	 }

	@EJB
	LoginRemote loginRemote ;
	
	
	public String doLogin() {
		 user = loginRemote.identifierUser(login, password);

		if (user instanceof Admin) {
			setLogin(user.getLogin());
			//return "/admin/acceuil?faces-redirect=true";
			return "/admin/acceuil?faces-redirect=true";
		} else if (user instanceof SuperVisor) {
			setLogin(user.getLogin());
			return "/superVisor/acceuil?faces-redirect=true";
		} else if (user instanceof Trainee) {
			setLogin(user.getLogin());
			return "/trainee/acceuil?faces-redirect=true";
		} else {
			FacesContext.getCurrentInstance().addMessage("authId:pwdId", new FacesMessage("n'existe pas"));
			return "/error?faces-redirect=true";
		}

		// redirection
	}

	/*
	
	public String doLogin(){
		String navigateTo=""; 
		user=loginRemote.identifierUser(login, password);
		if(user!=null){
			navigateTo="/Dashboard/Dashboard";
			System.out.println("hahahahah");
			
		}
		else
			navigateTo="/error";
		return navigateTo;
	}
	*/
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	

	
}
