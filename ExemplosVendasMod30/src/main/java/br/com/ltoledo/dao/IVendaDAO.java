package main.java.br.com.ltoledo.dao;

import main.java.br.com.ltoledo.dao.generic.IGenericDAO;
import main.java.br.com.ltoledo.domain.Venda;
import main.java.br.com.ltoledo.exceptions.DAOException;
import main.java.br.com.ltoledo.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
