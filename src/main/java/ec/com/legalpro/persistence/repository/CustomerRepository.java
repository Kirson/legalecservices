package ec.com.legalpro.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.com.legalpro.persistence.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>  {
	
	public List<Customer> findByDocumentNumber(String documentNumber);
	public List<Customer> findByNick(String nick);

}
