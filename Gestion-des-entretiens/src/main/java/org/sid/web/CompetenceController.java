package org.sid.web;

import java.util.List;

import org.sid.dao.CompetenceRepository;
import org.sid.entities.Competence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class CompetenceController {
	@Autowired
	private CompetenceRepository competenceRepository;

	@RequestMapping(value="/competences", method=RequestMethod.GET)
	public List<Competence> getCompetences(){
		return competenceRepository.findAll();	
	}

}
