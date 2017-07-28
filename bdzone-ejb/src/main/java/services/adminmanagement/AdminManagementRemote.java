package services.adminmanagement;

import java.util.List;

import javax.ejb.Remote;

import entities.Category;
import entities.SuperVisor;

@Remote
public interface AdminManagementRemote {

	Category ajouterCateg(Category category);

	String modifierCateg(Category category);

	Category chercherCategParId(int id);

	List<Category> chercherCategParNom(String nom);

	String affecterSupervisorCategory(SuperVisor superVisor, Category category);

	List<SuperVisor> listerSupervisorsCateg(Category category);

}
