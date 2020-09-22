package ec.com.legalpro.persistence.entity.base;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Catalog implements Serializable{

	/**
	 * Serial version
	 */
	private static final long serialVersionUID = 7745663436825639164L;

	@Column(name="nemonic",length=10)
	protected String nemonic;
	
	@Column(name="name",length=30)
	protected String name;
	
	@Column(name="description",length=80)
	protected String description;

	public String getNemonic() {
		return nemonic;
	}

	public void setNemonic(String nemonic) {
		this.nemonic = nemonic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
