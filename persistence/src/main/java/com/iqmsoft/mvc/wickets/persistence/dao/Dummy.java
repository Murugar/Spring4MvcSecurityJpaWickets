package com.iqmsoft.mvc.wickets.persistence.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.data.jpa.domain.AbstractPersistable;





@Entity
public class Dummy extends  AbstractPersistable<Long>{

	private String name;


	@ManyToOne
	private CategoryDummy category;
	
	public Dummy()
	{
		
	}
	
	/**
	 * @return the cat
	 */
	public CategoryDummy getCategory() {
		return category;
	}

	/**
	 * @param cat the cat to set
	 */
	public void setCategory(CategoryDummy cat) {
		this.category = cat;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}