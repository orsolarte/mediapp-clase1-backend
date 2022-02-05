package com.mitocode.service;

import java.util.List;

import com.mitocode.model.Paciente;

public interface IPacienteService {
	
	Paciente registrar(Paciente p) throws Exception;
	Paciente modificar(Paciente p) throws Exception;
	List<Paciente> listar() throws Exception;
	Paciente listarPorId(Integer id) throws Exception;
	void eliminar(Integer id) throws Exception;
}
