package com.emprestimodelivro.model.entidade;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Livro")
@ManagedBean(name="Livro")
@RequestScoped
public class Livro implements Serializable {

    @Id
    @GeneratedValue
    private Integer codLivro;

    @Column(length = 50)
    private String autor;

    @Column(length = 50)
    private String titulo;

    @Column
    private boolean emprestado;

    public Livro(Integer codLivro, String autor, String titulo, boolean emprestado) {
        this.codLivro = codLivro;
        this.autor = autor;
        this.titulo = titulo;
        this.emprestado = emprestado;
    }

    public Livro() {
    }

    public Integer getCodLivro() {
        return codLivro;
    }

    public void setCodLivro(Integer codLivro) {
        this.codLivro = codLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    @Override
    public String toString() {
        return "Livro{" + "codLivro=" + codLivro + ", autor=" + autor + ", titulo=" + titulo + ", emprestado=" + emprestado + '}';
    }

}