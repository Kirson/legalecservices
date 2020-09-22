package ec.com.legalpro.persistence.entity.base;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public class Person implements Serializable {

	/**
	 * Serial version
	 */
	private static final long serialVersionUID = 8556364487381403633L;

	@Column(name="name",length=30)
	protected String name;
	
	@Column(name="last_name",length=30)
	protected String lastName;
	
	@Column(name="document_number",length=20)
	protected String documentNumber;
	
	@Column(name="birth_date")
	@Temporal(TemporalType.TIMESTAMP)
	protected Date birthDate;
	
	@Column(name="email",length=50)
	protected String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	
}
