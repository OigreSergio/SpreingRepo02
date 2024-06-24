package com.example.Repository2Ex;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RepositoriesProgrammingLanguages extends JpaRepository<ProgrammingLanguages , Long> {
}

