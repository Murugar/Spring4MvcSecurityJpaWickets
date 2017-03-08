
package com.iqmsoft.spring.mvc.wickets.web.exceptions;


public class NullJpaRepositoryException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public NullJpaRepositoryException() {
		super("jpaRepository is null! Please set the jpaRepository in your constructor");
	}

}
