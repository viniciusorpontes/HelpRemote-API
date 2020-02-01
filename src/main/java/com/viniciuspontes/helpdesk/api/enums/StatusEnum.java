package com.viniciuspontes.helpdesk.api.enums;

public enum StatusEnum {
	
	Novo,
	Assinado,
	Resolvido,
	Aprovado,
	Desaprovado,
	Fechado;
	
	public static StatusEnum getStatus(String status) {
		switch(status) {
		case "Novo" : return Novo;
		case "Resolvido" : return Resolvido;
		case "Aprovado" : return Aprovado;
		case "Desaprovado" : return Desaprovado;
		case "Assinado" : return Assinado;
		case "Fechado" : return Fechado;
		default : return Novo;
		}
	}
	

}
