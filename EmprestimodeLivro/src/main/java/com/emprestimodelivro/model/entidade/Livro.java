package com.emprestimodelivro.model.entidade;

import java.io.Serializable;
import java.util.Objects;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="livro")
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

    public void add() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void add(String titulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.codLivro);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Livro other = (Livro) obj;
        if (!Objects.equals(this.codLivro, other.codLivro)) {
            return false;
        }
        return true;
    }

}