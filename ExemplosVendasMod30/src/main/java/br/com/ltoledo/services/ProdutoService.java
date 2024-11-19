package main.java.br.com.ltoledo.services;

import main.java.br.com.ltoledo.dao.IProdutoDAO;
import main.java.br.com.ltoledo.domain.Produto;
import main.java.br.com.ltoledo.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}
