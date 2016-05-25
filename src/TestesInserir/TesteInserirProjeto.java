/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestesInserir;

import EntityManager.EntityManagerUtil;
import javax.persistence.EntityManager;
import modelo.bean.Projeto;
import modelo.bean.Setor;

/**
 *
 * @author mateus
 */
public class TesteInserirProjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EntityManager em = EntityManagerUtil.getEntityManager();
        
        Projeto proj = new Projeto();
        Setor set = em.find(Setor.class, 1);
        proj.setTipoproj("Orçamento (Formulário x)");
        proj.setSetor(set);
        
        em.getTransaction().begin();
        em.persist(proj);
        em.getTransaction().commit();
        
        
        
        
    }
    
}
 