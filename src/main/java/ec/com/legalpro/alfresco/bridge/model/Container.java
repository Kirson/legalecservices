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
public class Container implements Serializable
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -3378003681927647046L;

	@Key
    public String id;
        
    @Key
    public String folderId;    
}
