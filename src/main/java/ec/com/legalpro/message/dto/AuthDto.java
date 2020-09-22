package ec.com.legalpro.message.dto;

import java.io.Serializable;

public class AuthDto implements Serializable {

	/**
	 * Serial version
	 */
	private static final long serialVersionUID = 4308300769608489718L;
	private String userName;
	private String email;
	private String password;
	private Boolean auth;
	
	public AuthDto() {
		this.auth = false;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getAuth() {
		return auth;
	}

	public void setAuth(Boolean auth) {
		this.auth = auth;
	}
	
	
}
