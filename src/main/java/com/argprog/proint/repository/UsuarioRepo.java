package com.argprog.proint.repository;

import com.argprog.proint.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepo extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByEmail(String email);
}
