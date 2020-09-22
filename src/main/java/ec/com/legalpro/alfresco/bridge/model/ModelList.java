/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.legalpro.alfresco.bridge.model;

import com.google.api.client.util.Key;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Cristhian Herrera
 */
public class ModelList<T extends Entry> implements Serializable
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -1701704472958900269L;

	@Key
    public ArrayList<T> entries;
        
    @Key
    public Pagination pagination;
}
