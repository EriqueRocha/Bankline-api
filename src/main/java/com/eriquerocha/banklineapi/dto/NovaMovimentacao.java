package com.eriquerocha.banklineapi.dto;

import com.eriquerocha.banklineapi.model.MovimentacaoTipo;

public class NovaMovimentacao {
	private String descricao;
	private Double valor;
	private MovimentacaoTipo tipo;
	private Integer idConta;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescrição(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public MovimentacaoTipo getTipo() {
		return tipo;
	}
	public void setTipo(MovimentacaoTipo tipo) {
		this.tipo = tipo;
	}
	public Integer getIdConta() {
		return idConta;
	}
	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}
	

}
