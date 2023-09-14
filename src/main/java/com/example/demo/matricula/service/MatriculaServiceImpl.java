package com.example.demo.matricula.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matricula.repo.IEstudianteRepo;
import com.example.demo.matricula.repo.IMateriaRepo;
import com.example.demo.matricula.repo.IMatriculaRepo;
import com.example.demo.matricula.repo.modelo.Estudiante;
import com.example.demo.matricula.repo.modelo.Materia;
import com.example.demo.matricula.repo.modelo.Matricula;

@Service
public class MatriculaServiceImpl implements IMatriculaService {
	@Autowired
	private IMateriaRepo materiaRepo;
	@Autowired
	private IEstudianteRepo estudianteRepo;
	@Autowired
	private IMatriculaRepo matriculaRepo;

	@Override
	public void matricular(String codigo, String cedula) {
		// TODO Auto-generated method stub
		Materia materia = this.materiaRepo.buscarPórCodigo(codigo);
		Estudiante estudiante = this.estudianteRepo.buscar(cedula);
		Matricula matricula = new Matricula();
		matricula.setFecha(LocalDate.now());
		matricula.setEstudiante(estudiante);
		matricula.setMateria(materia);
		this.matriculaRepo.insertar(matricula);
		materia.setEstudiantes(materia.getEstudiantes() + 1);
		this.materiaRepo.actualizar(materia);
	}

	@Override
	public List<Matricula> reporte(String cedula) {
		// TODO Auto-generated method stub
		return this.matriculaRepo.buscarAll(cedula);
	}

}
