package com.example.backendfinal.repo;

import com.example.backendfinal.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Userrepo extends JpaRepository<User, Long>
{

}
