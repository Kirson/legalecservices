package ec.com.legalpro.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.com.legalpro.persistence.entity.ProcessType;

public interface ProcessTypeRepository extends JpaRepository<ProcessType, Long>  {
	
	public List<ProcessType> findByNemonic(String nemonic);

}
