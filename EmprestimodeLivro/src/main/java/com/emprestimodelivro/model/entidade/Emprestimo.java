package com.emprestimodelivro.model.entidade;

import java.io.Serializable;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name="Emprestimo")
@ManagedBean(name="Emprestimo")
@RequestScoped
public class Emprestimo implements Serializable {
    
    @Id
    @GeneratedValue
    private Integer codEmprestimo;

    @OneToMany
    Livro livro = null;
    
    @OneToOne
    Pessoa pessoa = null;
    
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataEmprestimo;
    
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataDevolucao;

    public Emprestimo(Integer codEmprestimo, Livro livro, Pessoa pessoa, Date dataEmprestimo, Date dataDevolucao) {
        this.codEmprestimo = codEmprestimo;
        this.livro = livro;
        this.pessoa = pessoa;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public Emprestimo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getCodEmprestimo() {
        return codEmprestimo;
    }

    public void setCodEmprestimo(Integer codEmprestimo) {
        this.codEmprestimo = codEmprestimo;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString() {
        return "Emprestimo{" + "codEmprestimo=" + codEmprestimo + ", livro=" + livro + ", pessoa=" + pessoa + ", dataEmprestimo=" + dataEmprestimo + ", dataDevolucao=" + dataDevolucao + '}';
    }
    
}
