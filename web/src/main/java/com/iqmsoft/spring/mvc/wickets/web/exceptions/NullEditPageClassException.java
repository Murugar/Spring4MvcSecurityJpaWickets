/**
 * 
 */
package com.iqmsoft.spring.mvc.wickets.web.exceptions;


public class NullEditPageClassException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public NullEditPageClassException() {
		super("editPageClass is null! Please set the editPageClass in your constructor");
	}

}
