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

import ec.com.legalpro.persistence.entity.base.Catalog;

@Entity
@Table(name = "lp_case_status")
@Audited
@JsonIgnoreProperties("inspection")
public class CaseStatus extends Catalog implements Serializable {

	/**
	 * Serial version
	 */
	private static final long serialVersionUID = -8350130814365581990L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="case_status_id")
	private Long id;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	
	
}
