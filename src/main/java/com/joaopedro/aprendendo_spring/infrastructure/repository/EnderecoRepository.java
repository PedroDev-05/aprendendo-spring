package com.joaopedro.aprendendo_spring.infrastructure.repository;

import com.joaopedro.aprendendo_spring.infrastructure.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Usuario, Long> {
}
