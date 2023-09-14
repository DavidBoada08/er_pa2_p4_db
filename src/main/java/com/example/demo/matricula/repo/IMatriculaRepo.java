package com.example.demo.matricula.repo;

import java.util.List;

import com.example.demo.matricula.repo.modelo.Matricula;

public interface IMatriculaRepo {
	
	public void insertar(Matricula matricula);
	public List<Matricula> buscarAll(String cedula);
}
