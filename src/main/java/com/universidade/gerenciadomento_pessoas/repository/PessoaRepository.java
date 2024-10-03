package com.universidade.gerenciadomento_pessoas.repository;

import com.universidade.gerenciadomento_pessoas.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}