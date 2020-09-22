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
@Table(name = "lp_attachment")
@Audited
@JsonIgnoreProperties("inspection")
public class Attachment extends DocumentInfo implements Serializable {

	/**
	 * Serial version
	 */
	private static final long serialVersionUID = 9163073588621827377L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="attachment_id")
	private Long id;
	
	@Column(name="attachment_name",length=150)
	private String attachmentName;
	
	@JsonBackReference("attachment-folder")
	@JoinColumn(name = "folder_id", referencedColumnName = "folder_id")
    @ManyToOne(fetch = FetchType.LAZY)
	private Folder folder;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAttachmentName() {
		return attachmentName;
	}

	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}

	public Folder getFolder() {
		return folder;
	}

	public void setFolder(Folder folder) {
		this.folder = folder;
	}
	
	
}
