package com.example.pontointeligente.api.services;

import java.util.Optional;

import com.example.pontointeligente.api.entities.Funcionario;

public interface FuncionarioService {
	
	/**
	 * Persiste um funcionário na base de dados
	 * 
	 * @param funcionario
	 * @return funcionario
	 */
	
	Funcionario persistir(Funcionario funcionario);
	
	/**
	 * Busca e retorna um funcionario dado um CPF
	 *  
	 * @param cpf
	 * @return Optional<Funcionario>
	 */
	Optional<Funcionario> buscarPorCpf(String cpf);
	
	/**
	 * Busca e retorna um funcionario dado um email
	 * 
	 * @param email
	 * @return Optional<Funcionario>
	 */
	Optional<Funcionario> buscarPorEmail(String email);
	
	/**
	 * Busca e retorna funcionario por ID
	 * 
	 * @param id
	 * @return Optional<Funcionario>
	 */
	Optional<Funcionario> buscarPorId(Long id);

}
