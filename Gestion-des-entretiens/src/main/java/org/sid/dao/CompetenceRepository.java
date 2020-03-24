package org.sid.dao;
  
import org.sid.entities.Competence;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin; 

  @CrossOrigin("*")
  @RestResource
  public interface CompetenceRepository extends JpaRepository<Competence, Long>{
	  @RestResource(path = "/metierlibelle")
	  public Page<Competence> findBylibelleContains(@Param("mc") String mc, Pageable pageable); 
   }
   

 