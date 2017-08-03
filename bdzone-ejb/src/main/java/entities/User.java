package entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity

@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="role")
public class User implements Serializable {
//public abstract class User implements Serializable {
	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	
	
	private String firstName;
	private String lastName;
	private String login ;
	private String eMail;
	private String password;
	 private boolean Baned;
	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}   
	public User(String firstName2, String lastName2, String eMail2) {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}   
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}   
	public String getEMail() {
		return this.eMail;
	}

	public void setEMail(String eMail) {
		this.eMail = eMail;
	}
   
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public boolean isBaned() {
		return Baned;
	}
	public void setBaned(boolean baned) {
		Baned = baned;
	}
	
}
