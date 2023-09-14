package com.example.demo.matricula.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.matricula.repo.modelo.Materia;
import com.example.demo.matricula.repo.modelo.Matricula;

@Controller
@RequestMapping("/matriculas")
public class homeController {
	
	@GetMapping("/nuevo")
	private String paginaNuevaMateria(Matricula matricula) {
		
		return "home";
		
	}
	
	@GetMapping("/materia")
	private String enviarMateria(Materia Materia) {
		
		return"vistaNuevaMateria";
		
	}
	
	

}
