package ec.com.legalpro.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import ec.com.legalpro.persistence.entity.Appointment;
import ec.com.legalpro.persistence.entity.CaseLaw;
import ec.com.legalpro.persistence.entity.Customer;
import ec.com.legalpro.persistence.entity.Lawyer;

public interface AppointmentRepository extends JpaRepository<Appointment, Long>  {
	
	public List<Appointment> findByCustomer(Customer customer); 
	public List<Appointment> findByLawyer(Lawyer lawyer); 
	public List<Appointment> findByCaseLaw(CaseLaw caseLaw); 
	public List<Appointment> findByLawyerDocument(String lawyerDocument); 

}
