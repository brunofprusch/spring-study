package br.com.spring.study.formas.geometricas.impl;

import br.com.spring.study.formas.geometricas.interfaces.Quadrado;

public class QuadradoImpl implements Quadrado {

	public Integer area(Integer lado) {
		return lado * lado;
	}

}
