package com.example.demo.matricula.repo;

import com.example.demo.matricula.repo.modelo.Estudiante;

public interface IEstudianteRepo {
	public void ingresar(Estudiante estudiante);
	public Estudiante buscar(String cedula);
}
