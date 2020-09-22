package ec.com.legalpro.alfresco.bridge.bean;

import java.io.Serializable;

public class AlfrescoBean implements Serializable {

	/**
	 * Serial version
	 */
	private static final long serialVersionUID = 1L;
	private String authToken;

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	
	
}
