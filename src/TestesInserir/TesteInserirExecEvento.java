/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestesInserir;

import EntityManager.EntityManagerUtil;
import javax.persistence.EntityManager;
import modelo.bean.ExecEvento;
import modelo.bean.Setor;

/**
 *
 * @author mateus
 */
public class TesteInserirExecEvento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       EntityManager em = EntityManagerUtil.getEntityManager();
        
        ExecEvento ex = new ExecEvento();
        Setor set = em.find(Setor.class, 1);
        
        ex.setExecucao("Assessoria de imprensa (fotos)");
        ex.setNomesetor(set);
        
        em.getTransaction().begin();
        em.persist(ex);
        em.getTransaction().commit();
        
        
        
    }
    
}
