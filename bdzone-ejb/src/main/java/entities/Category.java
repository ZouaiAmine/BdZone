package entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Category
 *
 */
@Entity
public class Category implements Serializable {

	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id_Catg;
	private String module;
	

	@Enumerated(EnumType.STRING)
	private CategoryType categoryType ; 
	
	@ManyToOne
	private Admin administrateur ;
	
	@OneToMany(mappedBy="category")
	private List<Question> questions ;
	
	@OneToMany
	private List<SuperVisor> superVisors ;
	
	
	private static final long serialVersionUID = 1L;

	public Category() {
		super();
	}

	
	public int getId_Catg() {
		return this.id_Catg;
	}

	public void setId_Catg(int id_Catg) {
		this.id_Catg = id_Catg;
	}

	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public CategoryType getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(CategoryType categoryType) {
		this.categoryType = categoryType;
	}

	public Admin getAdministrateur() {
		return administrateur;
	}
	
	

	public void setAdministrateur(Admin administrateur) {
		this.administrateur = administrateur;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public List<SuperVisor> getSuperVisors() {
		return superVisors;
	}

	public void setSuperVisors(List<SuperVisor> superVisors) {
		this.superVisors = superVisors;
	}

}
