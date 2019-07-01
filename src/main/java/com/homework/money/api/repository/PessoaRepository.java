package com.homework.money.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homework.money.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}