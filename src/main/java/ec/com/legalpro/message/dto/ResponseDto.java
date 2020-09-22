package ec.com.legalpro.message.dto;

import java.io.Serializable;
import java.util.List;

import ec.com.legalpro.persistence.entity.AppUser;
import ec.com.legalpro.persistence.entity.Appointment;
import ec.com.legalpro.persistence.entity.Customer;

public class ResponseDto implements Serializable {

	/**
	 * Serial version
	 */
	private static final long serialVersionUID = -1825414827715858931L;
	
	private String result;
	private AppUser user;
	private Customer customer;
	private List<Appointment> appointmentList;
	
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public AppUser getUser() {
		return user;
	}
	public void setUser(AppUser user) {
		this.user = user;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Appointment> getAppointmentList() {
		return appointmentList;
	}
	public void setAppointmentList(List<Appointment> appointmentList) {
		this.appointmentList = appointmentList;
	}
	
	
}
