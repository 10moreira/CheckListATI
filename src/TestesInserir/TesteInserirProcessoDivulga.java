/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestesInserir;

import EntityManager.EntityManagerUtil;
import javax.persistence.EntityManager;
import modelo.bean.ProcessoDivul;

/**
 *
 * @author mateus
 */
public class TesteInserirProcessoDivulga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManager em = EntityManagerUtil.getEntityManager();
        
        ProcessoDivul procdi = new ProcessoDivul();
        
        
        procdi.setConvite("Autoridades externas");
        procdi.setTipodivulg("Jornal Minuano");
        
        em.getTransaction().begin();
        em.persist(procdi);
        em.getTransaction().commit();
        
    }
    
}
