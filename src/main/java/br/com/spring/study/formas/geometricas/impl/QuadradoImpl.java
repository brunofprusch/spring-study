package br.com.spring.study.formas.geometricas.impl;

import org.springframework.stereotype.Component;

import br.com.spring.study.formas.geometricas.interfaces.Quadrado;

@Component
public class QuadradoImpl implements Quadrado {

	public Integer area(Integer lado) {
		return lado * lado;
	}

}
