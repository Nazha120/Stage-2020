package org.sid.web;

import java.util.List;
import org.sid.dao.MetierRepository;
import org.sid.entities.Metier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class MetierController {
	@Autowired
	private MetierRepository metierRepository;

	@RequestMapping(value="/metiers", method=RequestMethod.GET)
	public List<Metier> getMetiers(){
		return metierRepository.findAll();	
	}

}
