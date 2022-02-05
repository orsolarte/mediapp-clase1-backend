package com.mitocode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.Paciente;
import com.mitocode.service.IPacienteService;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

	@Autowired
	private IPacienteService service;
	
	@GetMapping
	public List<Paciente> listar() throws Exception{
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public Paciente listarPorId(@PathVariable("id") Integer id) throws Exception{
		return service.listarPorId(id);
	}
	
	@PostMapping
	public Paciente registrar(@RequestBody Paciente p) throws Exception{
		return service.registrar(p);
	}
	
	@PutMapping
	public Paciente modificar(@RequestBody Paciente p) throws Exception{
		Paciente pac = service.listarPorId(p.getIdPaciente());
		if(pac != null) {
			///Este es un comentario para probar github
			return service.modificar(p);	
		}
		return null;
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) throws Exception {
		service.eliminar(id);
	}
}
