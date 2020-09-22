package ec.com.legalpro.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.com.legalpro.persistence.entity.Lawyer;

public interface LawyerRepository extends JpaRepository<Lawyer, Long>  {
	
	public List<Lawyer> findByDocumentNumber(String documentNumber);

}
