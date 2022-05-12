package com.eriquerocha.banklineapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eriquerocha.banklineapi.model.Correntista;

public interface CorrentistaRepository extends JpaRepository<Correntista, Integer> {

}
