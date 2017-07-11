package entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: SuperVisor
 *
 */
@Entity

public class SuperVisor implements Serializable {

	   
	@Id
	private int id_SV;
	private String username;
	private String password;
	private static final long serialVersionUID = 1L;

	@ManyToMany(mappedBy="superVisors")
	private List<Category> categories ;
	
	public SuperVisor() {
		super();
	}   
	public int getId_SV() {
		return this.id_SV;
	}

	public void setId_SV(int id_SV) {
		this.id_SV = id_SV;
	}   
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
   
}
