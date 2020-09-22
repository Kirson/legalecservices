package ec.com.legalpro.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import ec.com.legalpro.persistence.entity.base.DocumentInfo;

@Entity
@Table(name = "lp_folder")
@Audited
@JsonIgnoreProperties("inspection")
public class Folder extends DocumentInfo implements Serializable {

	/**
	 * Serial version
	 */
	private static final long serialVersionUID = 3177265215942536789L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="folder_id")
	private Long id;
	
	@JsonBackReference("folder-case")
	@JoinColumn(name = "case_law_id", referencedColumnName = "case_law_id")
    @ManyToOne(fetch = FetchType.LAZY)
	private CaseLaw caseLaw;
	
	@Column(name="folder_number",length=50)
	protected String folderNumber;
	
	@Column(name="folder_name",length=150)
	protected String folderName;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CaseLaw getCaseLaw() {
		return caseLaw;
	}

	public void setCaseLaw(CaseLaw caseLaw) {
		this.caseLaw = caseLaw;
	}

	public String getFolderNumber() {
		return folderNumber;
	}

	public void setFolderNumber(String folderNumber) {
		this.folderNumber = folderNumber;
	}

	public String getFolderName() {
		return folderName;
	}

	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}

	
	
	
}
