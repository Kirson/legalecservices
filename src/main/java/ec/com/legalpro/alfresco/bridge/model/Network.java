/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.legalpro.alfresco.bridge.model;

import com.google.api.client.util.Key;
import java.io.Serializable;

/**
 *
 * @author Cristhian Herrera
 */
public class Network implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3851919427997969433L;

	@Key
	public String id;

	@Key
	public boolean homeNetwork;

	@Key
	public boolean paidNetwork;

	@Key
	public boolean isEnabled;

	@Key
	public String subscriptionLevel;

}
