package com.managedbean;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import javax.faces.bean.ManagedBean;

import javax.faces.bean.ViewScoped;

import entities.CategoryType;
import entities.Question;
import entities.SuperVisor;
import entities.Trainee;

import services.adminmanagement.AdminManagementRemote;
import services.traineemanagment.TraineeManagementRemote;

@ManagedBean(name = "dtBasicView")
@ViewScoped
public class BasicView {

	// private List<Agent> cars;
	private List<SuperVisor> superVisors;
	private List<Trainee> trainees;
	private List<Question> questions;

	@EJB
	AdminManagementRemote adminManagementRemote;
	
	@EJB
	TraineeManagementRemote traineeManagementRemote;
	

	private CategoryType categoryType ;
	private Question question;
	private Trainee trainee;
	private SuperVisor superVisor;
	private List<String> images;

	@PostConstruct
	public void init() {
		superVisor = new SuperVisor();
		superVisors = new ArrayList<>();
		superVisors = adminManagementRemote.afficherSuperVisor();

		trainee = new Trainee();
		trainees = new ArrayList<Trainee>();
		trainees = adminManagementRemote.afficherTrainees();

		question = new Question();
		questions = new ArrayList<>();
		questions = adminManagementRemote.afficherQuestions();

		images = new ArrayList<String>();
		for (int i = 1; i <= 12; i++) {
			images.add("nature" + i + ".jpg");
		}

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

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public CategoryType getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(CategoryType categoryType) {
		this.categoryType = categoryType;
	}

	//
	// public String close(SuperVisor u) {
	// u.setBaned(true);
	// adminManagementRemote.closeUser(u);
	//
	// return "";
	// }
	//
	//
	// public String delete(User u) {
	// ser.supprimerUser(u);
	// //init();
	// //return "/User/Agent/UserList?faces-redirect=true";
	// return "";
	// }
}