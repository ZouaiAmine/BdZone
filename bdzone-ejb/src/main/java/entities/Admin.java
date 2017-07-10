package entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Admin
 *
 */
@Entity

public class Admin implements Serializable {

	   
	public String getUsernameAd() {
		return usernameAd;
	}
	public void setUsernameAd(String usernameAd) {
		this.usernameAd = usernameAd;
	}

	@Id
	private int id_Ad;
	private String passwordAd;
	private String usernameAd ;
	private static final long serialVersionUID = 1L;

	public Admin() {
		super();
	}   
	public int getId_Ad() {
		return this.id_Ad;
	}

	public void setId_Ad(int id_Ad) {
		this.id_Ad = id_Ad;
	}   
	public String getPasswordAd() {
		return this.passwordAd;
	}

	public void setPasswordAd(String passwordAd) {
		this.passwordAd = passwordAd;
	}
   
}
