package com.emprestimodelivro.dao;

import com.emprestimodelivro.model.entidade.Pessoa;

public interface PessoaDAO extends DAOGenerico<Pessoa>{
    
    public Pessoa buscarPorNome (String Nome);

}
