package com.rodrigoferreira.demoparkapi.repository;

import com.rodrigoferreira.demoparkapi.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}