/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestesInserir;

import EntityManager.EntityManagerUtil;
import javax.persistence.EntityManager;
import modelo.bean.ExecEvento;
import modelo.bean.PosExec;

/**
 *
 * @author mateus
 */
public class TesteInserirPosExec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       EntityManager em = EntityManagerUtil.getEntityManager();
        
        PosExec px = new PosExec();
        ExecEvento ex = em.find(ExecEvento.class, 1);
        
      px.setAvaliado("Certificados on line");
      px.setExecevento(ex);
        
      em.getTransaction().begin();
      em.persist(ex);
      em.getTransaction().commit();
        
        
    }
    
}
