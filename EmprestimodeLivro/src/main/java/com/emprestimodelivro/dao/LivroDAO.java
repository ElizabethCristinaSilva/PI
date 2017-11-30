package com.emprestimodelivro.dao;

import com.emprestimodelivro.model.entidade.Livro;

public interface LivroDAO extends DAOGenerico<Livro> {
     
    public Livro buscarPorTitulo (String titulo);
    
}