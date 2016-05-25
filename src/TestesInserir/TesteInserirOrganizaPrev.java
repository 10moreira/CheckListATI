/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestesInserir;

import EntityManager.EntityManagerUtil;
import javax.persistence.EntityManager;
import modelo.bean.Atividade;
import modelo.bean.OrganizaPrev;

/**
 *
 * @author mateus
 */
public class TesteInserirOrganizaPrev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManager em = EntityManagerUtil.getEntityManager();
        
        OrganizaPrev org = new OrganizaPrev();
        Atividade atv = em.find(Atividade.class, 1);
        
        org.setNecessidade("Texto de apresentação dos anais");
        org.setEnvolvidos("Alunos e universidades");
        org.setAlunosespc("");
        org.setDiscurso("Coordenadoes de cursos");
        org.setExtruturaex("Gazebo");
        org.setAtividade(atv);
        
        em.getTransaction().begin();
        em.persist(org);
        em.getTransaction().commit();
 
    }
    
}
