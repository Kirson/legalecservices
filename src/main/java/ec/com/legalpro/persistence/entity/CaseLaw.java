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
@Table(name = "lp_case_law")
@Audited
@JsonIgnoreProperties("inspection")
public class CaseLaw implements Serializable {

	/**
	 * serial version
	 */
	private static final long serialVersionUID = -2975761332461620615L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="case_law_id")
	private Long id;
	
	@Column(name="description",length=200)
	private String description;
	
	@Column(name="creation_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;
	
	@Column(name="update_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;
	
	@JsonBackReference("case-processType")
	@JoinColumn(name = "process_type_id", referencedColumnName = "process_type_id")
    @ManyToOne(fetch = FetchType.LAZY)
	private ProcessType processType;
	
	@JsonBackReference("case-customer")
	@JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    @ManyToOne(fetch = FetchType.LAZY)
	private Customer customer;
	
	@JsonBackReference("case-lawyer")
	@JoinColumn(name = "lawyer_id", referencedColumnName = "lawyer_id")
    @ManyToOne(fetch = FetchType.LAZY)
	private Lawyer lawyer;
	
	
	@JsonBackReference("case-status")
	@JoinColumn(name = "case_status_id", referencedColumnName = "case_status_id")
    @ManyToOne(fetch = FetchType.LAZY)
	private CaseStatus status;
	
	@JsonBackReference("case-judgment")
	@JoinColumn(name = "judgment_information_id", referencedColumnName = "judgment_information_id")
    @ManyToOne(fetch = FetchType.LAZY)
	private JudgmentInformation judgmentInformation;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ProcessType getProcessType() {
		return processType;
	}

	public void setProcessType(ProcessType processType) {
		this.processType = processType;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public CaseStatus getStatus() {
		return status;
	}

	public void setStatus(CaseStatus status) {
		this.status = status;
	}

	public Lawyer getLawyer() {
		return lawyer;
	}

	public void setLawyer(Lawyer lawyer) {
		this.lawyer = lawyer;
	}

	public JudgmentInformation getJudgmentInformation() {
		return judgmentInformation;
	}

	public void setJudgmentInformation(JudgmentInformation judgmentInformation) {
		this.judgmentInformation = judgmentInformation;
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
