package ec.com.legalpro.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.envers.Audited;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import ec.com.legalpro.persistence.entity.base.Person;



@Entity
@Table(name = "lp_customer")
@Audited
@JsonIgnoreProperties("inspection")
public class Customer extends Person implements Serializable {

	/**
	 * Serial version
	 */
	private static final long serialVersionUID = 1476443519620807566L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="customer_id")
	private Long id;
	
	@Column(name="nick",length=30)
	private String nick;
	
	@Column(name="register_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date registerDate;
	
	@Column(name="creation_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;
	
	@Column(name="update_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	
	
}
