package br.com.spring.study.formas.geometricas.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.spring.study.formas.geometricas.model.Results;

@Repository
public class ResultsDAO {

	@PersistenceContext
	private EntityManager em;

	public Long insert(Results result){
		em.persist(result);
		em.flush();
		return result.getId();
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEmf(EntityManager em) {
		this.em = em;
	}
}
