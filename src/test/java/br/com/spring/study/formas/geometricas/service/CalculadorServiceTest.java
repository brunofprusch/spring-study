package br.com.spring.study.formas.geometricas.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.spring.study.formas.geometricas.dao.ResultsDAO;
import br.com.spring.study.formas.geometricas.model.Results;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-core.xml"})
public class CalculadorServiceTest {

	@Autowired
	CalculadorService calculadorService;
	
	@Autowired
	ResultsDAO resultsDAO;
	
	@Test
	public void testDependenciInjection(){
		Integer ladoDoQuadrado = 21;
		Integer expectedArea = 441;
		
		Integer areaDoQuadrado = calculadorService.calcularAreaQuadrado(ladoDoQuadrado);
	
		assertEquals(expectedArea, areaDoQuadrado);
	}
	
	@Test
	public void testSaveResults(){
		Results results = new Results();
		
		results.setCalculation("Area Quadrado");
		results.setResult("200");
		
		calculadorService.saveResults(results);
	}
}
