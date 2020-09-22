package ec.com.legalpro.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.com.legalpro.persistence.entity.CaseStatus;

public interface CaseStatusRepository extends JpaRepository<CaseStatus, Long>  {
	
	public List<CaseStatus> findByNemonic(String nemonic);
    

}
