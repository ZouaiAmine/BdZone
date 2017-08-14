package com.managedbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import entities.Category;
import entities.CategoryType;
import entities.Question;
import entities.SuperVisor;
import entities.Trainee;
import services.adminmanagement.AdminManagementRemote;
import services.usermanagement.QuestionsLocal;
import services.usermanagement.QuestionsRemote;

@ManagedBean
@RequestScoped
public class TraineeMB implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@EJB
	AdminManagementRemote adminManagementRemote;
	@EJB
	QuestionsRemote questionsRemote;
	
	
	private List<Trainee> trainees;
	//Trainee trainee;
//	@ManagedProperty(value = "#{CategoryMB}")
//	private CategoryMB gererCateg ;
	private List<Category> categories1;
	private List<String> categories;
	private Category category ;
	private Question question ;
	private Boolean renderList;
	private Boolean renderAddForm;
	private Trainee trainee;
	private Boolean renderUpdateForm;
	private int idQtion ;
	private String descriptionQ ;
	private String lastName ;
	private String firstName ;
	private String email ;
	private CategoryType type ;
	//private List<CategoryType> types ;
	
	@PostConstruct
	public void init() {
		//Category categ = new Category() ;
		//categories1 =new ArrayList<Category>() ;
		
		
		trainee = new Trainee() ;
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

	 public CategoryType[] getTypes() {
	        return CategoryType.values();
	    }

	
//	public String stageTerminer(Trainee trainee) {
//		System.out.println("in !!!!!");
//		System.out.println("trainee "+trainee.getFirstName());
//		
//
//		return "/User/admin/listSupervisors?faces-redirect=true";
//	}
	
	public String update() {
	
		System.out.println("name : "+trainee.getFirstName());
		adminManagementRemote.modifierTainee(trainee);

		return "/User/admin/userList?faces-redirect=true";
	}
	
	public String ajouterTrainee() {
		
		adminManagementRemote.ajouterTrainee(trainee);
		return "/User/admin/userList?faces-redirect=true";
	}
	

	public void askQuestion() {
	
		Question qtion= new Question() ;
		//qtion.setIdQuestion(idQtion);
	//	qtion.setTrainee(trainee);
		qtion.setType(type);
		//qtion.setCategory(category);
		qtion.setDescriptionQ(descriptionQ);
		//qtion.setTrainee(getTrainee());
		questionsRemote.addQuestion(qtion); 
		
	}

	public void updateQuestion() {
		Trainee trainee =new Trainee() ;
		Question qtion= new Question() ;
		qtion.setIdQuestion(idQtion);
		qtion.setTrainee(trainee);
		
	}
	
	
	
//	
//	public String update() {
//		System.out.println("cin  "+trainee.getFirstName());
//		trainee.seteMail(email);
//		trainee.setFirstName(firstName);
//		trainee.setLastName(lastName);
//		adminManagementRemote.updatee(trainee);
//
//		return "User/admin/userList?faces-redirect=true";
//	}
	
	
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


	


	public Boolean getRenderUpdateForm() {
		return renderUpdateForm;
	}


	public void setRenderUpdateForm(Boolean renderUpdateForm) {
		this.renderUpdateForm = renderUpdateForm;
	}



	public Trainee getTrainee() {
		return trainee;
	}



	public void setTrainee(Trainee trainee) {
		this.trainee = trainee;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	

	public void setIdQtion(int idQtion) {
		this.idQtion = idQtion;
	}



	public String getDescriptionQ() {
		return descriptionQ;
	}



	public void setDescriptionQ(String descriptionQ) {
		this.descriptionQ = descriptionQ;
	}



	public Category getCategory() {
		return category;
	}



	public void setCategory(Category category) {
		this.category = category;
	}



	public int getIdQtion() {
		return idQtion;
	}



	public List<String> getCategories() {
		return categories;
	}



	public void setCategories(List<String> categories) {
		this.categories = categories;
	}






	public void setCategories1(List<Category> categories1) {
		this.categories1 = categories1;
	}



	public List<Category> getCategories1() {
		return categories1;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}



	public CategoryType getType() {
		return type;
	}



	public void setType(CategoryType type) {
		this.type = type;
	}

}
