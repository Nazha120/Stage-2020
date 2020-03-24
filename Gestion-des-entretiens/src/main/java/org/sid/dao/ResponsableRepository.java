package org.sid.dao;
  
import org.sid.entities.Responsable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin; 
  @CrossOrigin("*")
  @RestResource
  public interface ResponsableRepository extends JpaRepository<Responsable, Long>{
   
  }
 