package com.emprestimodelivro.model.entidademodel;

import com.emprestimodelivro.dao.PessoaDAO;
import com.emprestimodelivro.model.entidadehibernetedao.PessoaHibernateDAO;
import com.emprestimodelivro.model.entidade.Pessoa;
import java.util.List;

public class PessoaModel {
    
    private PessoaDAO pessoaDAO;
    
    public PessoaModel() {
        this.pessoaDAO = new PessoaHibernateDAO();
    }
    
    public void inserirPessoa(Pessoa pessoa) {
        this.pessoaDAO.inserir(pessoa);
    }
    
    public void atualizarPessoa(Pessoa pessoa) {
        this.pessoaDAO.alterar(pessoa);
    }
    
    public void deletarPessoa(Pessoa pessoa) {
        this.pessoaDAO.deletar(pessoa);
    }
    
    public List<Pessoa> buscarTodos() {
        return this.pessoaDAO.recuperarTodos();
    }
    
    
}
