package com.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
//import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.faces.bean.ViewScoped;

import entities.Admin;
import entities.Category;
import entities.Question;
import entities.Trainee;
import services.usermanagement.QuestionsRemote;

@javax.faces.bean.ManagedBean
@ViewScoped
public class QuestionMB {

	@EJB
	 private QuestionsRemote questionsRemote ;
	

		private int idQtion ;
		private Category category ;
		private String type ;
		private Admin admin ;

		private String[] selectedCategory;
	    //private String[] selectedCities2;
	    private List<String> categories;
	     
	    @PostConstruct
	    public void init() {
	    	categories = new ArrayList<String>();
	    	categories.add("JAVA");
	    	categories.add("ASP.NET");
	    	categories.add("JSF");
	    	categories.add("BI");
	    	categories.add("php");
	    
	    }
		
		public int getIdQtion() {
			return idQtion;
		}

		public void setIdQtion(int idQtion) {
			this.idQtion = idQtion;
		}

		public String[] getSelectedCategory() {
			return selectedCategory;
		}

		public void setSelectedCategory(String[] selectedCategory) {
			this.selectedCategory = selectedCategory;
		}

		public List<String> getCategories() {
			return categories;
		}

		public void setCategories(List<String> categories) {
			this.categories = categories;
		}

		public void POST() {
			
			Trainee trainee =new Trainee() ;
			Question qtion= new Question() ;
			qtion.setIdQuestion(idQtion);
			qtion.setTrainee(trainee);
			questionsRemote.addQuestion(qtion); ;
			
		}

		public void askQuestion() {
			Trainee trainee =new Trainee() ;
			Question qtion= new Question() ;
			qtion.setIdQuestion(idQtion);
			qtion.setTrainee(trainee);
			questionsRemote.addQuestion(qtion); 
			
		}

		public void updateQuestion() {
			Trainee trainee =new Trainee() ;
			Question qtion= new Question() ;
			qtion.setIdQuestion(idQtion);
			qtion.setTrainee(trainee);
			
		}


		public void getQuestion(int id) {
			
		}
			
		public void deleteQuestion(int id) {
			
		}

		
		
		/*
		public List<Question> getAllQuestions() {
			return questionsRemote.getallqustions ;
			
		}*/


		public int getId() {
			return idQtion;
		}

		public void setId(int id) {
			this.idQtion = idQtion;
		}

		public Category getCategory() {
			return category;
		}

		public void setCategory(Category category) {
			this.category = category;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Admin getAdmin() {
			return admin;
		}

		public void setAdmin(Admin admin) {
			this.admin = admin;
		}
}
