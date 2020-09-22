package ec.com.legalpro.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.envers.Audited;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "lp_app_user")
@Audited
@JsonIgnoreProperties("inspection")
public class AppUser implements Serializable {

	/**
	 * Serial version
	 */
	private static final long serialVersionUID = -7143445444497669743L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="app_user_id")
	private Long id;
	
	@Column(name="full_name",length=80)
	protected String fullName;

	@Column(name="user_name",length=30)
	protected String userName;
	
	@Column(name="user_password",length=30)
	protected String password;
	
	@Column(name="email",length=50)
	protected String email;
	
	@Column(name="user_status",length=10)
	protected String userStatus;
	
	@Column(name="type",length=2)
	protected String type;
	
	@Column(name="social_network",length=30)
	protected String socialNetwork;
	
	@Column(name="creation_date")
	@Temporal(TemporalType.TIMESTAMP)
	protected Date creationDate;
	
	@Column(name="update_date")
	@Temporal(TemporalType.TIMESTAMP)
	protected Date updateDate;
	
	@JsonBackReference("user-customer")
	@JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    @ManyToOne(fetch = FetchType.LAZY)
	protected Customer customer;

	@JsonBackReference("user-lawyer")
	@JoinColumn(name = "lawyer_id", referencedColumnName = "lawyer_id")
    @ManyToOne(fetch = FetchType.LAZY)
	protected Lawyer lawyer;
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	
	

	public Lawyer getLawyer() {
		return lawyer;
	}

	public void setLawyer(Lawyer lawyer) {
		this.lawyer = lawyer;
	}

	public String getSocialNetwork() {
		return socialNetwork;
	}

	public void setSocialNetwork(String socialNetwork) {
		this.socialNetwork = socialNetwork;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
	
}
