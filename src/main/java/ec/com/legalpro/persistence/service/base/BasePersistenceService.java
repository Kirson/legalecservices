package ec.com.legalpro.persistence.service.base;

import org.springframework.beans.factory.annotation.Autowired;

import ec.com.legalpro.persistence.repository.AppUserRepository;
import ec.com.legalpro.persistence.repository.AppointmentRepository;
import ec.com.legalpro.persistence.repository.AttachmentRepository;
import ec.com.legalpro.persistence.repository.CaseLawRepository;
import ec.com.legalpro.persistence.repository.CaseStatusRepository;
import ec.com.legalpro.persistence.repository.CustomerRepository;
import ec.com.legalpro.persistence.repository.FolderRepository;
import ec.com.legalpro.persistence.repository.LawyerRepository;
import ec.com.legalpro.persistence.repository.ProcessTypeRepository;

public class BasePersistenceService {

	@Autowired protected AppointmentRepository appointmentRepository;
	@Autowired protected AppUserRepository appUserRepository;
	@Autowired protected AttachmentRepository attachmentRepository;
	@Autowired protected CaseLawRepository caseLawRepository;
	@Autowired protected CaseStatusRepository caseStatusRepository;
	@Autowired protected CustomerRepository customerRepository;
	@Autowired protected FolderRepository folderRepository;
	@Autowired protected LawyerRepository lawyerRepository;
	@Autowired protected ProcessTypeRepository processTypeRepository;
}
