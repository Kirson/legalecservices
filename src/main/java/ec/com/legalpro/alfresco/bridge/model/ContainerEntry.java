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
public class ContainerEntry extends Entry implements Serializable
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 8715553877886178679L;
	@Key
    public Container entry;   
}
