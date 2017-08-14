package com.managedbean;

import java.util.ArrayList;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;
import java.util.List;

import javax.annotation.PostConstruct;
//import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.faces.bean.ViewScoped;

import entities.Admin;
import entities.Category;
import entities.Question;
import entities.Trainee;
import services.adminmanagement.AdminManagementRemote;
import services.usermanagement.QuestionsRemote;

@javax.faces.bean.ManagedBean
@ViewScoped
public class QuestionMB {

	@EJB
	 private QuestionsRemote questionsRemote ;

	@EJB
	 private AdminManagementRemote adminManagementRemote;
	
	

		private int idQtion ;
		private Category category ;
		private String type ;
//		private Trainee trainee ;
//		private Question question ;
		private Admin admin ;
		private String text ;
		  
		   // private List<SelectItem> categories;
		
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
	    
//	    
//	    	 SelectItemGroup g1 = new SelectItemGroup("JAVA");
//	         g1.setSelectItems(new SelectItem[] {new SelectItem("JSF", "JSF"), new SelectItem("Java", "Java"), new SelectItem("EJB", "EJB")});
//	          
//	         SelectItemGroup g2 = new SelectItemGroup("BI");
//	         g2.setSelectItems(new SelectItem[] {new SelectItem("Data Maining", "Data Maining"), new SelectItem("Big Data", "Big Data"), new SelectItem("Machine Learning", "Machine Learning")});
//	          
//	         categories = new ArrayList<SelectItem>();
//	         categories.add(g1);
//	         categories.add(g2);
//	    
	    
	    
	    
	    
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

//		public List<SelectItem> getCategories() {
//			return categories;
//		}
//
//		public void setCategories(List<SelectItem> categories) {
//			this.categories = categories;
//		}

		public void POST() {
			
//			Trainee trainee =new Trainee() ;
//			Question qtion= new Question() ;
//			qtion.setIdQuestion(idQtion);
//			qtion.setTrainee(trainee);
//			questionsRemote.addQuestion(qtion); ;
			
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

		
		
//		public String AffecterCategorieQuestion() {
//			
//			adminManagementRemote.
//			return "" ;
//		}

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

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}















		public List<String> getCategories() {
			return categories;
		}















		public void setCategories(List<String> categories) {
			this.categories = categories;
		}
}
	



		
