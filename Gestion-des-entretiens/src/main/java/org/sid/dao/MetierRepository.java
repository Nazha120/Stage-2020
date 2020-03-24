package org.sid.dao;
  
import org.sid.entities.Metier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

  @CrossOrigin("*")
  @RestResource
  public interface MetierRepository extends JpaRepository<Metier, Long>{
      @RestResource(path = "/metierByIT")
	  public Page<Metier> findByITContains(@Param("mc") String mc, Pageable pageable); 
   }
 