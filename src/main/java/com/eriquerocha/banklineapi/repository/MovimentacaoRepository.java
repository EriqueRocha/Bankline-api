package com.eriquerocha.banklineapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eriquerocha.banklineapi.model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer> {

}
