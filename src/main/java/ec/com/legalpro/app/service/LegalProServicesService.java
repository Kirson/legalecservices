package ec.com.legalpro.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.com.legalpro.alfresco.bridge.bean.AlfrescoBean;
import ec.com.legalpro.alfresco.bridge.bean.AlfrescoDocumentBean;
import ec.com.legalpro.alfresco.bridge.bean.AlfrescoFolderBean;
import ec.com.legalpro.alfresco.bridge.service.AlfrescoService;
import ec.com.legalpro.message.dto.AuthDto;
import ec.com.legalpro.message.dto.RequestDto;
import ec.com.legalpro.message.dto.ResponseDto;
import ec.com.legalpro.persistence.entity.AppUser;
import ec.com.legalpro.persistence.service.AppUserService;
import ec.com.legalpro.persistence.service.AppointmentService;

@Service
public class LegalProServicesService {
	
	@Autowired
	AppUserService appUserService;
	@Autowired
	AppointmentService appointmentService;
	
	
	public ResponseDto auth(AuthDto authInfo) {
		ResponseDto response = new ResponseDto();
		
		AppUser user = appUserService.findByAuthValues(authInfo);
		
		if(user!=null) {
			response.setResult("00");
			response.setUser(user);
		}else {
			response.setResult("ERROR");
		}
		
		return response;
	}
	
	public ResponseDto registerUser(RequestDto request) {
		ResponseDto response = new ResponseDto();
		if(request.getUser()==null) {
			response.setResult("ERROR");
		}else {
			AppUser user =  appUserService.save(request.getUser());
			response.setUser(user);
			response.setResult("00");
		}
		return response;
	}
	

	//ECM functions
	public AlfrescoBean authAlfresco() {
		AlfrescoBean ab = new AlfrescoBean();
		try {
			ab.setAuthToken(AlfrescoService.getAuthenticationTicket());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ab;
	}
	
	public AlfrescoFolderBean getFolfer(String folder) {
		AlfrescoFolderBean afb = new AlfrescoFolderBean();
		
		afb.setFolder(AlfrescoService.getFolder(folder));
		return afb;
	}
	
	public AlfrescoFolderBean getRootFolfer() {
		AlfrescoFolderBean afb = new AlfrescoFolderBean();
		
		afb.setFolder(AlfrescoService.getRootFolder());
		return afb;
	}
	
	public AlfrescoDocumentBean getDocumentUrl(String folder, String documentName) {
		AlfrescoDocumentBean adb = new AlfrescoDocumentBean();
		
		String durl = AlfrescoService.getDocumentURL(null, folder, documentName);
		adb.setDocumentUrl(durl);
		return adb;
	}
	
}
