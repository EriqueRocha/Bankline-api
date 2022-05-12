package com.eriquerocha.banklineapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eriquerocha.banklineapi.dto.NovoCorrentista;
import com.eriquerocha.banklineapi.model.Correntista;
import com.eriquerocha.banklineapi.model.Movimentacao;
import com.eriquerocha.banklineapi.repository.CorrentistaRepository;
import com.eriquerocha.banklineapi.repository.MovimentacaoRepository;
import com.eriquerocha.banklineapi.service.CorrentistaService;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {
	@Autowired
	private CorrentistaRepository repository;
	
	@Autowired
	private CorrentistaService service;
	
	
	@GetMapping
	public List<Correntista> findAll(){
		return repository.findAll();
	}
	@PostMapping
	public void save(@RequestBody NovoCorrentista correntista) {
		service.save(correntista);
		
	}

}
