package com.iqmsoft.mvc.wickets.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.iqmsoft.mvc.wickets.persistence.dao.Dummy;

@Transactional
public interface DummyRepository extends JpaRepository<Dummy, Long> {

	@Query("select c from Dummy c where c.name = ?1")
	List<Dummy> findByName(String name);

}