package services.adminmanagement;


import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import entities.Category;
import entities.SuperVisor;






/**
 * Session Bean implementation class Login
 */
@Stateless
public class AdminManagement implements AdminManagementRemote,AdminManagementLocal {

	@PersistenceContext(unitName="bdzone-ejb")
	EntityManager entityManager ;
	
	public AdminManagement() {
        // TODO Auto-generated constructor stub
	}
    


	@Override
	public Category ajouterCateg(Category category) {
		
		return entityManager.merge(category);
	}

	@Override
	public String modifierCateg(Category category) {

		entityManager.merge(category);
		return "success";

	}
/*

	@Override
	public String supprimerLabo(Labo labo) {
		// il faut supprimer les liens avec employé (FK) pour pouvoir supprimer
		// le labo
		TypedQuery<Employe> query = em.createQuery("select e from Employe e where e.labo=:labo", Employe.class);
		query.setParameter("labo", labo);
		List<Employe> emps = query.getResultList();
		for (Employe employe : emps) {
			employe.setLabo(null);
		}
		em.remove(em.merge(labo));
		return "success";

	}
*/
		@Override
	public Category chercherCategParId(int id) {

		return entityManager.find(Category.class, id);

	}

	@Override
	public List<Category> chercherCategParNom(String nom) {
		TypedQuery<Category> query = entityManager.createQuery("Select l from Category l where l.nom=:n", Category.class);
		query.setParameter("n", nom);

		return query.getResultList();
	}

	@Override
	public String affecterSupervisorCategory(SuperVisor superVisor, Category category) {
		// si categery n'existe pas em.persist(categery);
		// si categery existe
		category = entityManager.find(Category.class, category.getId_Catg());
		// si supervisor existe
		if (entityManager.find(SuperVisor.class, superVisor.geteMail()) != null) {
			superVisor.setCategory(category);;
			// lorsqu'on ajoute une info à une entité existante il faut faire un
			// merge
			entityManager.merge(superVisor);
			return "success";
		} else {
			// si supervisor n'existe pas
			entityManager.persist(superVisor);
			// dans ce cas on n'a pas besoin de merge (revoir le cycle de vie
			// d'une entité dans le contexte de persistence)
			superVisor.setCategory(category);
			return "success";
		}

	}
/*
	@Override
	public void demissionnerEmployer(Employe employe, Labo labo) {

		// récupérer le labo (context de persistence)
		labo = em.find(Labo.class, labo.getId());

		// récupérer employe (attacher au context de persistence)

		employe = em.find(Employe.class, employe.getCin());

		// supprimer
		// vérifier que l'employé est affecté au labo passé en paramètres
		if (employe.getLabo().getId() == labo.getId()) {
			/**
			 * on a décidé pour la logique métier qu'un enmployé qui démissionne
			 * on l'efface de la BD, si on voulais le garder il suffisait de
			 * faire : employe.setLabo(null); rien pour supprimer la FK avec
			 * labo
			 **/
/*
			em.remove(employe);

		}

	}
*/
	
	@Override
	public List<SuperVisor> listerSupervisorsCateg(Category category) {
//		labo = em.find(Labo.class, labo.getId());
//		// pour que ça marche il faut ajouter fetch eager sur la relation
//		// employé côté labo
//		System.out.println("dans métier id labo "+ labo.getId());
//		return labo.getEmployes();
		TypedQuery<SuperVisor> query = entityManager.createQuery("select e from SuperVisor e where e.category=:category", SuperVisor.class);
		query.setParameter("category", category);
		return query.getResultList();
	}
/*
	@Override
	// avec cette même méthode on peut ajouter toutes les classes filles
	// (technicien ect)
	public void ajouterEmployer(Employe employe) {
		/*
		 * si jamais on ajoute un nouveau technicien et que du côté client on a
		 * affecté des compétences à ce technicien, il faut également persister
		 * les competences. Au lieu de le faire au niveau de la méthode métieur
		 * on ajoute cascade=cascadeType.Persist sur l'association compétence au
		 * niveau du technicien, la même lologique s'applique si on veut
		 * supprimer en cascade (cadcade.remove) ect, pour avoir tous les types
		 * de cascades on utilise cascadeType.ALL
		 */
/*
		// Remarque: si on a une relation @ManyToOne, on ne peut pas utiliser
		// cascade remove. Parce que si on supprime l'oject du côté one de la
		// relation, il reste des objets du côté many qui sont sensés êtres
		// connectés à cet objet
		em.persist(employe);

	}

	@Override
	public void affecterComptTech(Competence competence, Technicien technicien) {
		technicien = em.find(Technicien.class, technicien.getCin());
		em.persist(competence);
		if (technicien.getCompetences() == null) {
			List<Competence> competences = new ArrayList<Competence>();
			competences.add(competence);
			technicien.setCompetences(competences);

			// à chaque fois qu'on ajoute une nouvelle information à une entité
			// existante il faut faire un merge
			em.merge(technicien);
		} else {
			// Il faut toujours récupérer l'ancienne liste et y rajouter de
			// nouveaux éléments
			technicien.getCompetences().add(competence);
			em.merge(technicien);
		}

	}

	@Override
	public List<Competence> listerCompTechnicien(Technicien technicien) {
		technicien = em.find(Technicien.class, technicien.getCin());
		// il faut ajouter le fetch eager sur la list de competences dans
		// technicien
		return technicien.getCompetences();
	}

	@Override
	public Employe authentifier(String login, String password) {
		Employe employe = null;
		TypedQuery<Employe> query = em
				.createQuery("select e from Employe e where e.login=:login and e.password=:password ", Employe.class);
		query.setParameter("login", login);
		query.setParameter("password", password);
		try {
			return query.getSingleResult();

		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public Employe modifierEmployer(Employe employe) {
		// TODO Auto-generated method stub
		return em.merge(employe);
	}

}
*/
     
    
    
    }

