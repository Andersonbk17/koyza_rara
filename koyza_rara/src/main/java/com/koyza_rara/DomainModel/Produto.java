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

@Entity(name="Produto")
@Table(name="Produto")
public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    public Produto(){
        
    }
    
    
    private String nome;
    private Marca  marcas_idmarcas;
    private Fornecedores fornecedores_idfornecedores;
    private String tamanho;
    private String descricao;
    private String sexo;
    private String cor;
    private boolean ativo;
    private String cod_barra;
    private String data_entrada;

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

    public Marca getMarcas_idmarcas() {
        return marcas_idmarcas;
    }

    public void setMarcas_idmarcas(Marca marcas_idmarcas) {
        this.marcas_idmarcas = marcas_idmarcas;
    }

    public Fornecedores getFornecedores_idfornecedores() {
        return fornecedores_idfornecedores;
    }

    public void setFornecedores_idfornecedores(Fornecedores fornecedores_idfornecedores) {
        this.fornecedores_idfornecedores = fornecedores_idfornecedores;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getCod_barra() {
        return cod_barra;
    }

    public void setCod_barra(String cod_barra) {
        this.cod_barra = cod_barra;
    }

    public String getData_entrada() {
        return data_entrada;
    }

    public void setData_entrada(String data_entrada) {
        this.data_entrada = data_entrada;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.id);
        hash = 31 * hash + Objects.hashCode(this.nome);
        hash = 31 * hash + Objects.hashCode(this.marcas_idmarcas);
        hash = 31 * hash + Objects.hashCode(this.fornecedores_idfornecedores);
        hash = 31 * hash + Objects.hashCode(this.tamanho);
        hash = 31 * hash + Objects.hashCode(this.descricao);
        hash = 31 * hash + Objects.hashCode(this.sexo);
        hash = 31 * hash + (this.ativo ? 1 : 0);
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
        final Produto other = (Produto) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cod_barra, other.cod_barra)) {
            return false;
        }
        if (!Objects.equals(this.data_entrada, other.data_entrada)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + '}';
    }
    
    
       
    
    
    
    
    
}
