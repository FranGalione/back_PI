package com.argprog.proint.repository;

import com.argprog.proint.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepo extends JpaRepository<Persona, Long> {

}
