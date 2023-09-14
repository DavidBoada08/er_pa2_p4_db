package com.example.demo.matricula.repo.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "materia")
public class Materia {

	@Id
	@SequenceGenerator(name = "seq_mat", sequenceName = "seq_mat", allocationSize = 1)
	@GeneratedValue(generator = "seq_mat", strategy = GenerationType.SEQUENCE)
	@Column(name = "mat_id")
	private Integer id;
	@Column(name = "mat_nombre")
	private String nombre;
	@Column(name = "mat_codigo")
	private String codigo;
	@Column(name = "mat_descripcion")
	private String descripcion;
	@Column(name = "mat_creditos")
	private Integer creditos;
	@Column(name = "mat_estudiantes")
	private Integer estudiantes;
	// RELACIONES
	@OneToMany(mappedBy = "materia", fetch = FetchType.LAZY)
	private List<Matricula> matriculas;

	@Override
	public String toString() {
		return "Materia [id=" + id + ", nombre=" + nombre + ", codigo=" + codigo + ", descripcion=" + descripcion
				+ ", numero=" + creditos + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getNumero() {
		return creditos;
	}

	public void setNumero(Integer creditos) {
		this.creditos = creditos;
	}

	public List<Matricula> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(List<Matricula> matriculas) {
		this.matriculas = matriculas;
	}

	public Integer getCreditos() {
		return creditos;
	}

	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}

	public Integer getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(Integer estudiantes) {
		this.estudiantes = estudiantes;
	}

}
