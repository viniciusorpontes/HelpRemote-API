package com.viniciuspontes.helpdesk.api.dto;

import java.io.Serializable;

public class Summary implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer amountNovo;
	private Integer amountResolvido;
	private Integer amountAprovado;
	private Integer amountDesaprovado;
	private Integer amountAssinado;
	private Integer amountFechado;
	
	public Integer getAmountNovo() {
		return amountNovo;
	}
	public void setAmountNovo(Integer amountNovo) {
		this.amountNovo = amountNovo;
	}
	public Integer getAmountResolvido() {
		return amountResolvido;
	}
	public void setAmountResolvido(Integer amountResolvido) {
		this.amountResolvido = amountResolvido;
	}
	public Integer getAmountAprovado() {
		return amountAprovado;
	}
	public void setAmountAprovado(Integer amountAprovado) {
		this.amountAprovado = amountAprovado;
	}
	public Integer getAmountDesaprovado() {
		return amountDesaprovado;
	}
	public void setAmountDesaprovado(Integer amountDesaprovado) {
		this.amountDesaprovado = amountDesaprovado;
	}
	public Integer getAmountAssinado() {
		return amountAssinado;
	}
	public void setAmountAssinado(Integer amountAssinado) {
		this.amountAssinado = amountAssinado;
	}
	public Integer getAmountFechado() {
		return amountFechado;
	}
	public void setAmountFechado(Integer amountFechado) {
		this.amountFechado = amountFechado;
	}

	
}
