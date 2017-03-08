package com.iqmsoft.mvc.wickets.persistence.dao;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.data.jpa.domain.AbstractPersistable;



@Entity
public class CategoryDummy extends AbstractPersistable<Long>{

	
	
	private String name;
	
	@OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
	private Set<Dummy> dummy = new HashSet<Dummy>();
	
	
	public CategoryDummy()
	{
		
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the dummy
	 */
	public Set<Dummy> getDummy() {
		return dummy;
	}

	public void setDummy(Set<Dummy> dummy) {
		this.dummy = dummy;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
