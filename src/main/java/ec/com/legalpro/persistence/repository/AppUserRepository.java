package ec.com.legalpro.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.com.legalpro.persistence.entity.AppUser;



public interface AppUserRepository extends JpaRepository<AppUser, Long>  {
	
	public List<AppUser> findByUserName(String userName);
	public List<AppUser> findByUserNameAndPassword(String userName, String password);
	public List<AppUser> findByEmailAndPassword(String email, String password);

}
