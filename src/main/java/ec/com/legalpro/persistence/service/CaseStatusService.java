package ec.com.legalpro.persistence.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import ec.com.legalpro.persistence.entity.CaseStatus;

import ec.com.legalpro.persistence.service.base.BasePersistenceService;

@Service
@Configurable
public class CaseStatusService extends BasePersistenceService {

	public List<CaseStatus> findAll(){
		return caseStatusRepository.findAll();
	}
}
