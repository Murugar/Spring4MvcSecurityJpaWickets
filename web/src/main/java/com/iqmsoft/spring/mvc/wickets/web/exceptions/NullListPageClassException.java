
package com.iqmsoft.spring.mvc.wickets.web.exceptions;


public class NullListPageClassException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public NullListPageClassException() {
		super("listPageClass is null! Please set the listPageClass in your constructor");
	}

}
