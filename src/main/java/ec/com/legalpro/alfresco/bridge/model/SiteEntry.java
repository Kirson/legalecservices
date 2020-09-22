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
public class SiteEntry extends Entry implements Serializable
{
     /**
	  * 
	  */
	 private static final long serialVersionUID = 5152781826502246115L;
		
	 @Key
     public Site entry;  
    
}
