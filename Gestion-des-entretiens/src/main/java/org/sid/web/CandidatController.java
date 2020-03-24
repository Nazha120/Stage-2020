package org.sid.web;

import java.util.List;

import javax.naming.ldap.PagedResultsControl;

import org.sid.dao.CandidatRepository;
import org.sid.entities.Candidat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@RestController
@CrossOrigin("*")
public class CandidatController {
	@Autowired
	private CandidatRepository candidatRepository;
	
	@RequestMapping(value="/candidats", method=RequestMethod.GET)
	public List<Candidat> getCandidats(){
		return candidatRepository.findAll();	
	}
	
	@RequestMapping(value="/add-candidat", method=RequestMethod.POST)
	public Candidat save(@RequestBody Candidat c){		
		return candidatRepository.save(c);
	}
	
	
	@RequestMapping(value="/candidatByName", method=RequestMethod.GET)
	public Page<Candidat> chercher(
			@RequestParam(name="mc", defaultValue="") String mc,
			@RequestParam(name="page", defaultValue="0") int page,
			@RequestParam(name="size", defaultValue="5") int size) {
		Pageable paging = PageRequest.of(page, size);
		return candidatRepository.chercher("%" + mc +"%",paging); 
	}
	 
	
}
