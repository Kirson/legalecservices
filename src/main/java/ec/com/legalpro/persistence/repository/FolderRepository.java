package ec.com.legalpro.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.com.legalpro.persistence.entity.CaseLaw;
import ec.com.legalpro.persistence.entity.Folder;

public interface FolderRepository  extends JpaRepository<Folder, Long>{

	public List<Folder> findByCaseLaw(CaseLaw caselaw);
}
