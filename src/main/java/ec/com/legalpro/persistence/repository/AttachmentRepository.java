package ec.com.legalpro.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.com.legalpro.persistence.entity.Attachment;
import ec.com.legalpro.persistence.entity.Folder;

public interface AttachmentRepository extends JpaRepository<Attachment, Long>{

	public List<Attachment> findByFolder(Folder folder);
}
