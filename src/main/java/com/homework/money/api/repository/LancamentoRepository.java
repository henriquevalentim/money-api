package com.homework.money.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homework.money.api.model.Lancamento;
import com.homework.money.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {
	
}
