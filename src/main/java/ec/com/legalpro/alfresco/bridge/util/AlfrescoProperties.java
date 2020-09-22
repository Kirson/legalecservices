/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.legalpro.alfresco.bridge.util;

import java.io.Serializable;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * Clase para manejar archivo de propiedades
 * @author cherrera
 */
public class AlfrescoProperties implements Serializable
{

    /**
	 * 
	 */
	private static final long serialVersionUID = -6163562721173599452L;
	private static ResourceBundle resourceBundle  = ResourceBundle.getBundle("alfrescoconfig");
    

    /**
	 * Recupera una valor del archivo 
	 * de propiedades dado la clave
	 * 
	 * @param key
	 * @return	String
	 */
	public static String getString(String key) 
	{
		try 
		{
			
                        
                        String str = resourceBundle.getString(key);
                        
                       
                        
                        return str;
		}
		catch (MissingResourceException e) 
		{
			return '!' + key + '!';
		} catch (Exception e) {
			return '!' + key + '!';
		}
                
	}	
}