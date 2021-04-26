/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koyza_rara.DataAccess;

import com.koyza_rara.DomainModel.Fornecedores;
import java.util.List;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 *
 * @author Anderson
 */
public class FornecedoresDAO extends DAOGenerico<Fornecedores>{
    public FornecedoresDAO(){
        super(Fornecedores.class);
    }

   public List<Fornecedores> ListarTodos(){
        EntityTransaction transacao = manager.getTransaction();
        try{
            transacao.begin();
            String consulta = "Select s from Fornecedores s where s.ativo = 1";
            
             Query query = manager.createQuery(consulta);
             
             transacao.commit();
             return query.getResultList();
        
            
        }catch(Exception ex){
           ex.printStackTrace();
           transacao.rollback();
            return null;
        }
    
    }
    
    
    public List<Fornecedores> Buscar(Fornecedores obj) {
        // Corpo da consulta
        EntityTransaction transacao = manager.getTransaction();
        try {

            String consulta = "";
            if (obj.getId() != null) {
                 consulta = "Select s from Fornecedores s Where s.ativo = 1 and s.id like '%" + obj.getId() + "%'";
                 
             }else if(obj.getNome() != null){
                 consulta = "Select s from Fornecedores s Where s.ativo = 1 and s.nome like '%" + obj.getNome() + "%'";
             }
            transacao.begin();
            // Cria a consulta no JPA
            Query query = manager.createQuery(consulta);

           
            transacao.commit();
            return query.getResultList();
        } catch (Exception ex) {

            ex.printStackTrace();
            transacao.rollback();

            return null;
        }
    }
    
    
    
    
    
    

    @Override
    public boolean Apagar(Fornecedores obj) {
       EntityTransaction transacao = manager.getTransaction();
        try{
            transacao.begin();
            String consulta = "Update Fornecedores s set s.ativo = 0 WHERE s.id ="+obj.getId();
            
             Query query = manager.createQuery(consulta);
             query.executeUpdate();
             
             transacao.commit();
             return true;
        
            
        }catch(Exception ex){
           ex.printStackTrace();
           transacao.rollback();
            return false;
        }
    }
    
}
