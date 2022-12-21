package com.bibliotheque.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import com.bibliotheque.api.model.Description;
import com.bibliotheque.api.service.DescriptionService;

@RestController
@RequestMapping(ApiRegistration.REST_PREFIX + ApiRegistration.REST_DESCRIPTION)
public class DescriptionController {
    
    @Autowired
    private DescriptionService descriptionService;

    /**
	 * Read - Get one description 
	 * @param id The name of the description
	 * @return An Description object full filled
	 */
	@GetMapping("/description/{id}")
	public Description getDescription(@PathVariable("id") final int id) {
		Optional<Description> description = descriptionService.getDescription(id);
		if(description.isPresent()) {
			return description.get();
		} else {
			return null;
		}
	}
}
