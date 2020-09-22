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
public class Pagination implements Serializable
{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -1440431818083946747L;

	@Key
    public int count;
        
    @Key
    public boolean hasMoreItems;
        
    @Key
    public int totalItems;
        
    @Key
    public int skipCount;
        
    @Key
    public int maxItems;
}
