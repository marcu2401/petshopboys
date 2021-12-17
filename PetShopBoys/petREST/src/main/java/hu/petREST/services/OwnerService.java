package hu.petREST.services;

import hu.petREST.domain.Owner;
import hu.petREST.repositories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService {

    @Autowired
    private OwnerRepository repository;


    public Owner addOwner(Owner owner) {
        return repository.save(owner);
    }

    public List<Owner> getOwners() {
        return repository.findAll();
    }

    public List<Owner> getOwnersInCity(String city) {
        return repository.getOwnersInCity(city);
    }
}
