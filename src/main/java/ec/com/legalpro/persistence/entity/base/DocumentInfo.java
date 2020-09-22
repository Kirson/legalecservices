package ec.com.legalpro.persistence.entity.base;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public class DocumentInfo implements Serializable{
	
	/**
	 * Serial version
	 */
	private static final long serialVersionUID = 6899819371161929306L;

	@Column(name="server_url",length=200)
	protected String serverUrl;
	
	@Column(name="server_path",length=200)
	protected String serverPath;
	
	@Column(name="server_name",length=200)
	protected String serverName;

	@Column(name="reference",length=50)
	protected String reference;
	
	@Column(name="name",length=50)
	protected String name;
	
	@Column(name="creation_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;

	public String getServerUrl() {
		return serverUrl;
	}

	public void setServerUrl(String serverUrl) {
		this.serverUrl = serverUrl;
	}

	public String getServerPath() {
		return serverPath;
	}

	public void setServerPath(String serverPath) {
		this.serverPath = serverPath;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	
	
}
