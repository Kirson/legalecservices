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
public class SiteList implements Serializable
{
      /**
	 * 
	 */
	private static final long serialVersionUID = 1062012374196517714L;
		@Key
        public ModelList<SiteEntry> list;
}
