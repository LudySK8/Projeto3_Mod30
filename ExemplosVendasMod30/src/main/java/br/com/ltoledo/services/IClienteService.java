package main.java.br.com.ltoledo.services;

import main.java.br.com.ltoledo.domain.Cliente;
import main.java.br.com.ltoledo.exceptions.DAOException;
import main.java.br.com.ltoledo.exceptions.TipoChaveNaoEncontradaException;
import main.java.br.com.ltoledo.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

    //	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
    Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
