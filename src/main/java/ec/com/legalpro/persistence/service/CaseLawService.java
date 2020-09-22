package ec.com.legalpro.persistence.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import ec.com.legalpro.persistence.entity.CaseLaw;
import ec.com.legalpro.persistence.entity.Customer;
import ec.com.legalpro.persistence.service.base.BasePersistenceService;

@Service
@Configurable
public class CaseLawService extends BasePersistenceService {

	public List<CaseLaw> findByCustomer(Customer customer) {
		return caseLawRepository.findByCustomer(customer);
	}

	public CaseLaw save(CaseLaw caseLaw) {

		if (caseLaw.getId() == null) {
			caseLaw.setCreationDate(new Date());

		} else {
			caseLaw.setUpdateDate(new Date());
		}

		return caseLawRepository.save(caseLaw);
	}
}
