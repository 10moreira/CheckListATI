/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestesInserir;

import EntityManager.EntityManagerUtil;
import java.util.Calendar;
import javax.persistence.EntityManager;
import modelo.bean.Setor;

/**
 *
 * @author mateus
 */
public class TesteInserirSetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EntityManager em = EntityManagerUtil.getEntityManager();
        
        Setor set = new Setor();
        
        set.setEnvolvido("ATI");
        set.setParceiroexterno("Lojas De Informatica");
        set.setTitulo("Curso de linux");
        set.setDatsetor(Calendar.getInstance());
        set.setHorario(Calendar.getInstance());
        set.setLocalsetor("Campus Central");
        set.setCentro("CCEA");
        set.setCampus("Central");
        
        
        em.getTransaction().begin();
        em.persist(set);
        em.getTransaction().commit();
        
        
    }
    
}
