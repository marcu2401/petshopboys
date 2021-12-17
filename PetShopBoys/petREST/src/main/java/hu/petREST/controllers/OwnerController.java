package hu.petREST.controllers;

import hu.petREST.domain.Owner;
import hu.petREST.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OwnerController {

    @Autowired
    private OwnerService service;

    @GetMapping("/owners")
    public List<Owner> getOwners(){
        return service.getOwners();
    }

    @GetMapping("/owners/{city}")
    public List<Owner> getOwnersInCity(@PathVariable("city") String city){
        return service.getOwnersInCity(city);
    }

    @PostMapping("/owners")
    @ResponseStatus(HttpStatus.CREATED)
    public Owner addOwner(@RequestBody Owner owner){
        return service.addOwner(owner);
    }
}
