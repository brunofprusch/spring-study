package br.com.spring.study.formas.geometricas.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.spring.study.formas.geometricas.interfaces.Quadrado;

public class CalculadorService {

	@Autowired
	public Quadrado quadrado;

	
	public Integer calcularAreaQuadrado(Integer lado){
		return quadrado.area(lado);
	}
	
	public Quadrado getQuadrado() {
		return quadrado;
	}

	public void setQuadrado(Quadrado quadrado) {
		this.quadrado = quadrado;
	}
	
	
	
	
	
}
