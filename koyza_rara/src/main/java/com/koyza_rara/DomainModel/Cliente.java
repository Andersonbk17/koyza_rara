/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koyza_rara.DomainModel;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Anderson
 */
@Entity
@Table(name="Clientes")
public class Cliente  implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private boolean ativo;

   // @Temporal(javax.persistence.TemporalType.DATE)
  //  private Date dataCadastro;
    
    public Cliente(){
     //   this.dataCadastro = new Date();
        ativo = true;
        this.data_cadastro = new Date().toString();
    }
    
    private String nome;
    private String endereco_logradouro;
    private String endereco_numero;
    private String endereco_bairro;
    private String endereco_referencia;
    private String data_nascimento;
    private String endereco_cep;
    private String cpf;
    private String sexo;
    private String contato_tel;
    private String contato_email;
    private String data_cadastro;

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

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getEndereco_cep() {
        return endereco_cep;
    }

    public void setEndereco_cep(String endereco_cep) {
        this.endereco_cep = endereco_cep;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getContato_tel() {
        return contato_tel;
    }

    public void setContato_tel(String contato_tel) {
        this.contato_tel = contato_tel;
    }

    public String getContato_email() {
        return contato_email;
    }

    public void setContato_email(String contato_email) {
        this.contato_email = contato_email;
    }

    public String getSexo() {
        return sexo;
    }
    
    

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(String data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.ativo ? 1 : 0);
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + Objects.hashCode(this.cpf);
        hash = 29 * hash + Objects.hashCode(this.data_cadastro);
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
        final Cliente other = (Cliente) obj;
        return true;
    }

    
    

    

    @Override
    public String toString() {
        return this.getNome();
    }

    
    
    
}
