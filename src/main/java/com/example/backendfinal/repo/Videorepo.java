package com.example.backendfinal.repo;
import com.example.backendfinal.Model.User;
import com.example.backendfinal.Model.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Videorepo extends JpaRepository<Video, Long>
{

}
