package com.emprestimodelivro.controller;

import com.emprestimodelivro.model.entidademodel.EmprestimoModel;
import com.emprestimodelivro.model.entidade.Emprestimo;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="emprestimoController")
@SessionScoped
public class EmprestimoController {
    private EmprestimoModel emprestimoModel = null;
    private Emprestimo selecionarEmprestimo;
    private Emprestimo cadastroEmprestimo;

    public EmprestimoController() {
        this.emprestimoModel = new EmprestimoModel();
        this.cadastroEmprestimo = new Emprestimo();
    }

    public void adicionarEmprestimoAction() {
        this.emprestimoModel.inserirEmprestimo(this.cadastroEmprestimo);
        this.cadastroEmprestimo = new Emprestimo();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Emprestimo cadastrado com sucesso!"));
    }

    public void alterarEmprestimoAction() {
        this.emprestimoModel.atualizarEmprestimo(this.selecionarEmprestimo);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Emprestimo alterado com sucesso!"));
    }

    public void excluirEmprestimoAction() {
        this.emprestimoModel.deletarEmprestimo(this.selecionarEmprestimo);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Emprestimo deletado com sucesso!"));
    }

    public List<Emprestimo> recuperarTodos() {
        return this.emprestimoModel.buscarTodos();
    }
    
    public Emprestimo getSelecionarEmprestimo() {
        return selecionarEmprestimo;
    }

    public void setSelecionarEmprestimo(Emprestimo selecionarEmprestimo) {
        this.selecionarEmprestimo = selecionarEmprestimo;
    }
    
    public Emprestimo getCadastroEmprestimo (){
        return cadastroEmprestimo;
    }
    
    public void setCadastroEmprestimo (Emprestimo cadastroEmprestimo){
        this.cadastroEmprestimo = cadastroEmprestimo;
    }
    
}
