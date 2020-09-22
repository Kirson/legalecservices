package ec.com.legalpro.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "lp_judgment_information")
@Audited
@JsonIgnoreProperties("inspection")
public class JudgmentInformation implements Serializable {

	/**
	 * Serial version
	 */
	private static final long serialVersionUID = -1604072621413421939L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="judgment_information_id")
	private Long id;
	
	@Column(name="judgment_number",length=40)
	private String judgmentNumber;
	
	@Column(name="judicial_locker",length=40)
	private String judicialLocker;
	
	@Column(name="electronic_locker",length=40)
	private String electronicLocker;
	
	@Column(name="judgment_description",length=200)
	private String judgmentDescription;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJudgmentNumber() {
		return judgmentNumber;
	}

	public void setJudgmentNumber(String judgmentNumber) {
		this.judgmentNumber = judgmentNumber;
	}

	public String getJudicialLocker() {
		return judicialLocker;
	}

	public void setJudicialLocker(String judicialLocker) {
		this.judicialLocker = judicialLocker;
	}

	public String getElectronicLocker() {
		return electronicLocker;
	}

	public void setElectronicLocker(String electronicLocker) {
		this.electronicLocker = electronicLocker;
	}

	public String getJudgmentDescription() {
		return judgmentDescription;
	}

	public void setJudgmentDescription(String judgmentDescription) {
		this.judgmentDescription = judgmentDescription;
	}
	
	
}
