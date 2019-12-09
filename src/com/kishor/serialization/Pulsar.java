/**
 * 
 */
package com.kishor.serialization;

import java.io.Serializable;

/**
 * @author Kishor
 *
 */
public class Pulsar  extends TwoWheeler implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5183769125593559668L;
	
	public static final String str = "hello";
	
	
	public String onename = "Pulsar";
	
	@Override
	public String toString() {		
		String message = "thisone: " + onename +  "; Parent 1:" + twoname + "; Parent 2:" + threename;
		return message;
	}

}
