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
    private String cor;
    private String descricao;
    private String tamanho;
    private String sexo;
    private boolean ativo;
    private String cod_barra;
    
    
}
