package com.argprog.proint.controller;

import com.argprog.proint.models.Persona;
import com.argprog.proint.services.PersonaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/persona")
public class PersonaController {

    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Persona>getPersonaById(@PathVariable("id") Long id){
        Persona persona=personaService.findPersonaById(id);
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Persona>updatePersona(@RequestBody Persona persona){
        Persona updatePersona= personaService.updatePersona(persona);
        return new ResponseEntity<>(updatePersona, HttpStatus.OK);
    }
}
