package ec.com.legalpro.persistence.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import ec.com.legalpro.message.dto.AuthDto;
import ec.com.legalpro.persistence.entity.AppUser;
import ec.com.legalpro.persistence.service.base.BasePersistenceService;

@Service
@Configurable
public class AppUserService extends BasePersistenceService {

	public List<AppUser> findByUserNameAndPassword(String userName, String password) {
		return appUserRepository.findByUserNameAndPassword(userName, password);
	}
	
	public List<AppUser> findByEmailAndPassword(String email, String password) {
		return appUserRepository.findByEmailAndPassword(email, password);
	}

	public List<AppUser> getAll() {

		List<AppUser> response = new ArrayList<>();
		try {
			List<AppUser> founds = appUserRepository.findAll();
			for (AppUser user : founds) {
				response.add(user);
			}
		} catch (Exception e) {
			response = new ArrayList<>();
		}
		return response;
	}

	public AppUser findByAuthValues(AuthDto authInfo) {

		List<AppUser> founds = findByEmailAndPassword(authInfo.getEmail(), authInfo.getPassword());

		if (founds != null && !founds.isEmpty()) {
			return founds.get(0);
		} else {

			return null;
		}
	}

	public AppUser save(AppUser user) {
		user.setCreationDate(new Date());
		return appUserRepository.save(user);
	}
	
	public AppUser update(AppUser user) {
		user.setUpdateDate(new Date());
		return appUserRepository.save(user);
	}
}
