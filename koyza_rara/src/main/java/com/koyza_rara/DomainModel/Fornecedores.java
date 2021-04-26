/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koyza_rara.DomainModel;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Anderson
 */

@Entity(name="Fornecedores")
@Table(name="Fornecedores")
public class Fornecedores implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    public Fornecedores(){
        
    }
    
    private String nome;
    private String endereco_logradouro;
    private String endereco_numero;
    private String endereco_bairro;
    private String endereco_referencia;
    private String endereco_cep;
    private String contato_tel;
    private String contato_tel2;
    private String contato_email;
    private String cnpj;
    private boolean ativo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco_logradouro() {
        return endereco_logradouro;
    }

    public void setEndereco_logradouro(String endereco_logradouro) {
        this.endereco_logradouro = endereco_logradouro;
    }

    public String getEndereco_numero() {
        return endereco_numero;
    }

    public void setEndereco_numero(String endereco_numero) {
        this.endereco_numero = endereco_numero;
    }

    public String getEndereco_bairro() {
        return endereco_bairro;
    }

    public void setEndereco_bairro(String endereco_bairro) {
        this.endereco_bairro = endereco_bairro;
    }

    public String getEndereco_referencia() {
        return endereco_referencia;
    }

    public void setEndereco_referencia(String endereco_referencia) {
        this.endereco_referencia = endereco_referencia;
    }

    public String getEndereco_cep() {
        return endereco_cep;
    }

    public void setEndereco_cep(String endereco_cep) {
        this.endereco_cep = endereco_cep;
    }

    public String getContato_tel() {
        return contato_tel;
    }

    public void setContato_tel(String contato_tel) {
        this.contato_tel = contato_tel;
    }

    public String getContato_tel2() {
        return contato_tel2;
    }

    public void setContato_tel2(String contato_tel2) {
        this.contato_tel2 = contato_tel2;
    }

    public String getContato_email() {
        return contato_email;
    }

    public void setContato_email(String contato_email) {
        this.contato_email = contato_email;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.id);
        hash = 47 * hash + Objects.hashCode(this.nome);
        hash = 47 * hash + Objects.hashCode(this.cnpj);
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
        final Fornecedores other = (Fornecedores) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Fornecedores{" + "nome=" + nome + '}';
    }
    
    
    
    
}
