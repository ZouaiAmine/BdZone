package entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Category
 *
 */
@Entity

public class Category implements Serializable {

	@Id
	private int id_Catg;
	private String module;
	@Enumerated(EnumType.STRING)
	private CategoryType categoryType ; 
	
	

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

}
