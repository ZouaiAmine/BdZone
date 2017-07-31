package services.adminmanagement;

import javax.ejb.Local;

import entities.Category;

@Local
public interface AdminManagementLocal {

	void ajouterCate(Category category);

}
