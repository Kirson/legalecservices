package ec.com.legalpro.persistence.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import ec.com.legalpro.persistence.service.base.BasePersistenceService;
import ec.com.legalpro.persistence.entity.Appointment;
import ec.com.legalpro.persistence.entity.Lawyer;


@Service
@Configurable
public class AppointmentService extends BasePersistenceService {

	public List<Appointment> findByLawyer(Lawyer lawyer){
		return appointmentRepository.findByLawyer(lawyer);
	}
	
	public List<Appointment> findByLawyerDocument(String lawyerDocument){
		return appointmentRepository.findByLawyerDocument(lawyerDocument);
	}
	
	public Appointment save(Appointment appointment) {
		
		if(appointment.getId()==null) {
			appointment.setCreationDate(new Date());
			appointment.setOriginalDate(appointment.getAppointmentDate());
		}else {
			appointment.setUpdateDate(new Date());
		}
		
		// En caso de reagendar
		if(appointment.getReScheduleDate()!=null) {
			appointment.setAppointmentDate(appointment.getReScheduleDate());
		}
		
		return appointmentRepository.save(appointment);
	}

}
