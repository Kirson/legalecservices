package ec.com.legalpro.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.com.legalpro.persistence.entity.CaseLaw;
import ec.com.legalpro.persistence.entity.Customer;
import ec.com.legalpro.persistence.entity.Lawyer;

public interface CaseLawRepository extends JpaRepository<CaseLaw, Long>  {
	
	public List<CaseLaw> findByCustomer(Customer customer);
	public List<CaseLaw> findByLawyer(Lawyer lawyer);


}
