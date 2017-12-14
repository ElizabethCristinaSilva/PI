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
@Table (name="pessoa")
@ManagedBean (name="Pessoa")
@RequestScoped
public class Pessoa implements Serializable {
    
    @Id
    @GeneratedValue
    private Integer codPessoa;

    @Column (length = 50)
    private String nome;

    @Column (length = 15)
    private String CPF;

    @Column (length = 100)
    private String email;
    
    @Column
    private Integer telefone;

    @Column (length = 100)
    private String endereco;
    
    public Pessoa (Integer codPessoa, String nome, String CPF, String email, Integer telefone, String endereco){
        this.codPessoa = codPessoa;
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    public Pessoa (){
    }

    public Integer getCodPessoa() {
        return codPessoa;
    }

    public void setCodPessoa(Integer codPessoa) {
        this.codPessoa = codPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    @Override
    public String toString() {
        return "Pessoa{" + "codPessoa=" + codPessoa + ", nome=" + nome + ", cpf=" + CPF + ", email=" + email + ", telefone=" + telefone + ", endereco=" + endereco +'}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.codPessoa);
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
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.codPessoa, other.codPessoa)) {
            return false;
        }
        return true;
    }
    
}
