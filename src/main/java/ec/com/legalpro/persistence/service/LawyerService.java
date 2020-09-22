package ec.com.legalpro.persistence.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import ec.com.legalpro.persistence.entity.Lawyer;
import ec.com.legalpro.persistence.service.base.BasePersistenceService;

@Service
@Configurable
public class LawyerService extends BasePersistenceService {

	public Lawyer save(Lawyer lawyer) {

		if (lawyer.getId() == null) {
			lawyer.setCreationDate(new Date());
			
		} else {
			lawyer.setUpdateDate(new Date());
		}

	
		return lawyerRepository.save(lawyer);
	}
}
