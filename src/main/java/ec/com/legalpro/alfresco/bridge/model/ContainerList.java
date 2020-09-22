/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.legalpro.alfresco.bridge.model;

import java.io.Serializable;
import com.google.api.client.util.Key;



/**
 *
 * @author Cristhian Herrera
 */
public class ContainerList implements Serializable
{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 3147589336633889071L;
	@Key
    public ModelList<ContainerEntry> list;
}

