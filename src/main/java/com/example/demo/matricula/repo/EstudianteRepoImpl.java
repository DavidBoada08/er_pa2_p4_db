package com.example.demo.matricula.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.matricula.repo.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EstudianteRepoImpl implements IEstudianteRepo {

	@PersistenceContext
	private EntityManager entityManager ;

	@Override
	public void ingresar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(estudiante);
	}

	@Override
	public Estudiante buscar(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> query = this.entityManager
				.createQuery("SELECT e FROM Estudiante e WHERE e.cedula =: datoCedula", Estudiante.class);
		query.setParameter("datoCedula", cedula);
		return query.getSingleResult();
	}

}
