package com.example.demo.matricula.service;

import java.util.List;

import com.example.demo.matricula.repo.modelo.Matricula;

public interface IMatriculaService {
	public void matricular(String codigo, String cedula);

	public List<Matricula> reporte(String cedula);
}
