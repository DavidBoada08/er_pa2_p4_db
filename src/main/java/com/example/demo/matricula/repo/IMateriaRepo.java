package com.example.demo.matricula.repo;

import java.util.List;

import com.example.demo.matricula.repo.modelo.Materia;

public interface IMateriaRepo {
	
	public void insertar(Materia materia);

	public List<Materia> buscarAll();

	public void actualizar(Materia materia);

	public Materia buscarPórCodigo(String codigo);
}
