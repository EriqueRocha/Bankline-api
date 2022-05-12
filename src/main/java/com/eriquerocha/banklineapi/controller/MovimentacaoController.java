package com.eriquerocha.banklineapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eriquerocha.banklineapi.dto.NovaMovimentacao;
import com.eriquerocha.banklineapi.dto.NovoCorrentista;
import com.eriquerocha.banklineapi.model.Correntista;
import com.eriquerocha.banklineapi.model.Movimentacao;
import com.eriquerocha.banklineapi.repository.CorrentistaRepository;
import com.eriquerocha.banklineapi.repository.MovimentacaoRepository;
import com.eriquerocha.banklineapi.service.CorrentistaService;
import com.eriquerocha.banklineapi.service.MovimentacaoService;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {
	@Autowired
	private MovimentacaoRepository repository;
	
	@Autowired
	private MovimentacaoService service;
	
	
	@GetMapping
	public List<Movimentacao> findAll(){
		return repository.findAll();
	}
	@PostMapping
	public void save(@RequestBody NovaMovimentacao movimentacao) {
		service.save(movimentacao);
		
	}

}
