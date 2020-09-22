package ec.com.legalpro.app.controller;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.com.legalpro.alfresco.bridge.bean.AlfrescoBean;
import ec.com.legalpro.alfresco.bridge.bean.AlfrescoDocumentBean;
import ec.com.legalpro.alfresco.bridge.bean.AlfrescoFolderBean;
import ec.com.legalpro.app.service.LegalProServicesService;
import ec.com.legalpro.message.dto.AuthDto;
import ec.com.legalpro.message.dto.RequestDto;
import ec.com.legalpro.message.dto.ResponseDto;

@RestController
@RequestMapping("/api/legalpro")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class LegalProServicesController {

	@Autowired
	LegalProServicesService legalService;

	@PostMapping("/registerUser")
	public ResponseEntity<ResponseDto> registerUser(@RequestBody RequestDto obj) throws URISyntaxException {
		System.out.println("inside saveUser controller");
		ResponseDto response = legalService.registerUser(obj);
		return new ResponseEntity<ResponseDto>(response, HttpStatus.OK);
	}
	
	@PostMapping("/authorise")
	public ResponseEntity<ResponseDto> authorise(@RequestBody AuthDto obj) throws URISyntaxException {
		System.out.println("inside authorise controller");
		ResponseDto response = legalService.auth(obj);
		return new ResponseEntity<ResponseDto>(response, HttpStatus.OK);
	}
	
	@PostMapping("/authAlfresco")
	public ResponseEntity<AlfrescoBean> authAlfresco() throws URISyntaxException {
		System.out.println("inside authorise alfresco");
		AlfrescoBean response = legalService.authAlfresco();
		return new ResponseEntity<AlfrescoBean>(response, HttpStatus.OK);
	}
	
	@PostMapping("/getFolder")
	public ResponseEntity<AlfrescoFolderBean> getFolder(@RequestBody RequestDto obj) throws URISyntaxException {
		System.out.println("inside getFolder");
		AlfrescoFolderBean response = legalService.getFolfer(obj.getFolder());
		return new ResponseEntity<AlfrescoFolderBean>(response, HttpStatus.OK);
	}
	
	@PostMapping("/getRootFolder")
	public ResponseEntity<AlfrescoFolderBean> getRootFolder(@RequestBody RequestDto obj) throws URISyntaxException {
		System.out.println("inside getFolder");
		AlfrescoFolderBean response = legalService.getRootFolfer();
		return new ResponseEntity<AlfrescoFolderBean>(response, HttpStatus.OK);
	}
	
	@PostMapping("/getDocumentUrl")
	public ResponseEntity<AlfrescoDocumentBean> getDocumentUrl(@RequestBody RequestDto obj) throws URISyntaxException {
		System.out.println("inside getDocumentUrl");
		AlfrescoDocumentBean response = legalService.getDocumentUrl(obj.getFolder(), obj.getDocumentName());
		return new ResponseEntity<AlfrescoDocumentBean>(response, HttpStatus.OK);
	}
}
