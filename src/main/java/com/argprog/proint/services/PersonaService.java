package com.argprog.proint.services;

import com.argprog.proint.exception.UserNotFoundException;
import com.argprog.proint.models.Persona;
import com.argprog.proint.repository.PersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PersonaService {

    public final PersonaRepo personaRepo;

    @Autowired
    public PersonaService(PersonaRepo personaRepo) {
        this.personaRepo = personaRepo;
    }

    public Persona addPersona(Persona persona){
        return personaRepo.save(persona);
    }

    public List<Persona> buscarPersona(){
        return personaRepo.findAll();
    }

    public Persona updatePersona(Persona persona){
        return personaRepo.save(persona);
    }

    public Persona findPersonaById(Long id){
        return personaRepo.findById(id).orElseThrow(()->new UserNotFoundException("Persona no encontrada"));
    }
}
