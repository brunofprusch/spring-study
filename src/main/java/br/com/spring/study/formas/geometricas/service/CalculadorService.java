package br.com.spring.study.formas.geometricas.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.spring.study.formas.geometricas.dao.ResultsDAO;
import br.com.spring.study.formas.geometricas.interfaces.Quadrado;
import br.com.spring.study.formas.geometricas.model.Results;

@Component
public class CalculadorService {

	@Autowired
	public Quadrado quadrado;
	
	@Autowired
	public ResultsDAO resultsDAO;
	

	public Integer calcularAreaQuadrado(Integer lado){
		return quadrado.area(lado);
	}
	
	@Transactional
	public Long saveResults(Results results){
		resultsDAO.insert(results);	
		return results.getId();
	}
	
	public Quadrado getQuadrado() {
		return quadrado;
	}

	public void setQuadrado(Quadrado quadrado) {
		this.quadrado = quadrado;
	}
	
	
	
	
	
}
