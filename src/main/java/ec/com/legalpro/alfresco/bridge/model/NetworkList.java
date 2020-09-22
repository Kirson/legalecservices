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
public class NetworkList implements Serializable
{
   /**
	 * 
	 */
	private static final long serialVersionUID = -663411403572129749L;
	@Key
   public ModelList<NetworkEntry> list;   
   
  
 }
