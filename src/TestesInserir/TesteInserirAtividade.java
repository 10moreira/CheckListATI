/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestesInserir;

import EntityManager.EntityManagerUtil;
import javax.persistence.EntityManager;
import modelo.bean.Atividade;
import modelo.bean.ProcessoDivul;
import modelo.bean.Projeto;
import modelo.bean.Setor;

/**
 *
 * @author mateus
 */
public class TesteInserirAtividade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         EntityManager em = EntityManagerUtil.getEntityManager();
        
        Atividade atv = new Atividade();
        Projeto proj = em.find(Projeto.class, 1);
        Setor set = em.find(Setor.class, 1);
        ProcessoDivul proc = em.find(ProcessoDivul.class, 1);
        
        
        atv.setTipoatividade("Semana Academica");
        atv.setEspecificaatividade("Palestras e oficinas");
        atv.setNomesetor(set);
        atv.setProjeto(proj);
        atv.setProcessodivul(proc);
        
        em.getTransaction().begin();
        em.persist(atv);
        em.getTransaction().commit();
    
    }
    
}
