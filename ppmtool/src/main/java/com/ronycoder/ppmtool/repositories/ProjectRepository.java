package com.ronycoder.ppmtool.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ronycoder.ppmtool.domain.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project,Long> {
	
	Project findByProjectIdentifier(String projectId);
	Iterable<Project> findAll();
	
}
