package com.emprestimodelivro.model.entidademodel;

import com.emprestimodelivro.dao.EmprestimoDAO;
import com.emprestimodelivro.model.entidade.Emprestimo;
import com.emprestimodelivro.model.entidadehibernetedao.EmprestimoHibernateDAO;
import java.util.List;

public class EmprestimoModel {
    
    private EmprestimoDAO emprestimoDAO;
    
    public EmprestimoModel() {
        this.emprestimoDAO = new EmprestimoHibernateDAO() {};
    }
    
    public void inserirEmprestimo(Emprestimo emprestimo) {
        this.emprestimoDAO.inserir(emprestimo);
    }
    
    public Emprestimo buscarEmprestimo(Integer codigo) {
        return (Emprestimo) this.emprestimoDAO.buscarPorCodigo(codigo);
    }
    
    public void atualizarEmprestimo(Emprestimo emprestimo) {
        this.emprestimoDAO.alterar(emprestimo);
    }
    
    public void deletarEmprestimo(Emprestimo emprestimo) {
        this.emprestimoDAO.deletar(emprestimo);
    }
    
    public List<Emprestimo> buscarTodos() {
        return this.emprestimoDAO.recuperarTodos();
    }

}
