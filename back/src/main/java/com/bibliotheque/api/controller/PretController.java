package com.bibliotheque.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import com.bibliotheque.api.model.Pret;
import com.bibliotheque.api.service.PretService;

@RestController
@RequestMapping(ApiRegistration.REST_PREFIX + ApiRegistration.REST_PRET)
public class PretController {
    @Autowired
    private PretService pretService;

    /**
     * Read - Get all loans
     * @return - An Iterable object of Loans full filled
     */
    @GetMapping
    public Iterable<Pret> getPret() {
        return pretService.getPret();
    }

    /**
     * Read - Get one loan
     * @param id The id of the loan
     * @return An Loan object full filled
     */
    @GetMapping("{id}")
    public Pret getPret(@PathVariable("id") final Integer id) {
        Optional<Pret> pret = pretService.getPret(id);
        if(pret.isPresent()) {
            return pret.get();
        } else {
            return null;
        }
    }
    
}
