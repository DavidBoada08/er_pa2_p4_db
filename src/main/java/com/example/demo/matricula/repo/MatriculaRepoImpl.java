package com.example.demo.matricula.repo;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.matricula.repo.modelo.Matricula;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MatriculaRepoImpl implements IMatriculaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.entityManager.persist(matricula);
	}

	@Override
	public List<Matricula> buscarAll(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Matricula> query = this.entityManager.createQuery(
				"SELECT m FROM Matricula m JOIN m.materia a JOIN m.estudiante e WHERE e.cedula =: datoCedula",
				Matricula.class);
		query.setParameter("datoCedula", cedula);
		return query.getResultList();
	}

}
