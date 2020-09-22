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
@Table(name = "lp_process_type")
@Audited
@JsonIgnoreProperties("inspection")
public class ProcessType extends Catalog implements Serializable {

	/**
	 * Serial version
	 */
	private static final long serialVersionUID = 1274089154627553926L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="process_type_id")
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
