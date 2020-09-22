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
import javax.persistence.Transient;

import org.hibernate.envers.Audited;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "lp_appointment")
@Audited
@JsonIgnoreProperties("inspection")
public class Appointment implements Serializable {

	/**
	 * Serial version
	 */
	private static final long serialVersionUID = -644861744020912095L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="appointment_id")
	private Long id;
	
	@Column(name="appointment_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date appointmentDate;
	
	@Column(name="original_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date originalDate;
	
	@Column(name="creation_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;
	
	@Column(name="update_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;
	
	@JsonBackReference("appointment-customer")
	@JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    @ManyToOne(fetch = FetchType.LAZY)
	private Customer customer;
	
	@JsonBackReference("appointment-lawyer")
	@JoinColumn(name = "lawyer_id", referencedColumnName = "lawyer_id")
    @ManyToOne(fetch = FetchType.LAZY)
	private Lawyer lawyer;
	
	@JsonBackReference("appointment-case")
	@JoinColumn(name = "case_law_id", referencedColumnName = "case_law_id")
    @ManyToOne(fetch = FetchType.LAZY)
	private CaseLaw caseLaw;
	
	@Column(name="description",length=300)
	private String description;
	
	@Column(name="status",length=20)
	private String status;
	
	@Column(name="note",length=200)
	private String note;
	
	@Column(name="lawyer_document",length=20)
	private String lawyerDocument;
	
	@Column(name="customer_document",length=20)
	private String customerDocument;
	
	@Transient
	private Date reScheduleDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Lawyer getLawyer() {
		return lawyer;
	}

	public void setLawyer(Lawyer lawyer) {
		this.lawyer = lawyer;
	}

	public CaseLaw getCaseLaw() {
		return caseLaw;
	}

	public void setCaseLaw(CaseLaw caseLaw) {
		this.caseLaw = caseLaw;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getLawyerDocument() {
		return lawyerDocument;
	}

	public void setLawyerDocument(String lawyerDocument) {
		this.lawyerDocument = lawyerDocument;
	}

	public String getCustomerDocument() {
		return customerDocument;
	}

	public void setCustomerDocument(String customerDocument) {
		this.customerDocument = customerDocument;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getOriginalDate() {
		return originalDate;
	}

	public void setOriginalDate(Date originalDate) {
		this.originalDate = originalDate;
	}

	public Date getReScheduleDate() {
		return reScheduleDate;
	}

	public void setReScheduleDate(Date reScheduleDate) {
		this.reScheduleDate = reScheduleDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	
	
}
