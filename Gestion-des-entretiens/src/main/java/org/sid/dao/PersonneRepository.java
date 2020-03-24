package org.sid.dao;
  
import org.sid.entities.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin; 
  @CrossOrigin("*")
  @RestResource
  public interface PersonneRepository extends JpaRepository<Personne, Long>{
   
  }
 