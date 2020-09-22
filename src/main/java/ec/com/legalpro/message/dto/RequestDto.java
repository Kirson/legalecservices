package ec.com.legalpro.message.dto;

import java.io.Serializable;

import ec.com.legalpro.persistence.entity.AppUser;

public class RequestDto implements Serializable {

	/**
	 * Serial version
	 */
	private static final long serialVersionUID = 7542397278455992548L;
	private AuthDto authInfo;
	private AppUser user;
	private String documentNumber;
	private String documentName;
	private String transactionCode;
	private String folder;
	
	
	public AuthDto getAuthInfo() {
		return authInfo;
	}
	public void setAuthInfo(AuthDto authInfo) {
		this.authInfo = authInfo;
	}
	public AppUser getUser() {
		return user;
	}
	public void setUser(AppUser user) {
		this.user = user;
	}
	public String getDocumentNumber() {
		return documentNumber;
	}
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
	public String getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}
	public String getFolder() {
		return folder;
	}
	public void setFolder(String folder) {
		this.folder = folder;
	}
	public String getDocumentName() {
		return documentName;
	}
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}
	
	
}
