package br.com.spring.study.formas.geometricas.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-core.xml"})
public class CalculadorServiceTest {

	@Autowired
	CalculadorService calculadorService;
	
	@Test
	public void testarInjecaoDeDependencia(){
		Integer ladoDoQuadrado = 21;
		Integer expectedArea = 441;
		
		Integer areaDoQuadrado = calculadorService.calcularAreaQuadrado(ladoDoQuadrado);
	
		assertEquals(expectedArea, areaDoQuadrado);
	}
	
	
	
	
}
