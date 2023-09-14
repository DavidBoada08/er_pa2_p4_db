package com.example.demo.matricula.service;

import java.util.List;

import com.example.demo.matricula.repo.modelo.Materia;

public interface IMateriaService {

	public void guardar(Materia materia);

	public List<Materia> getAll();
}
