/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bean;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author mateus
 */
@Entity
@Table(name = "OrganizaPrev")
public class OrganizaPrev implements Serializable{
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "SEQ_OrganizaPr", sequenceName = "GEN_OrganizaPr_Id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_OrganizaPr")
    private int id;
    
    @Column(name = "necessidade", length = 200, nullable = false)
    private String necessidade;
    
    @Column(name = "discurso", length = 40, nullable = false)
    private String discurso;
    
    @Column(name = "envolvidos", length = 100, nullable = false)
    private String envolvidos;

    @Column(name = "extruturaex", length = 100, nullable = false)
    private String extruturaex;
    
     @Column(name = "alunosespc", length = 100)
    private String alunosespc;
    
    @ManyToOne
    @JoinColumn(name = "atividade", referencedColumnName = "id", nullable = false)
    private Atividade atividade;
    
    public OrganizaPrev() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

    public String getNecessidade() {
        return necessidade;
    }

    public void setNecessidade(String necessidade) {
        this.necessidade = necessidade;
    }

    

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.id;
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
        final OrganizaPrev other = (OrganizaPrev) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  ""+atividade;
    }

    public String getDiscurso() {
        return discurso;
    }

    public void setDiscurso(String discurso) {
        this.discurso = discurso;
    }

    public String getEnvolvidos() {
        return envolvidos;
    }

    public void setEnvolvidos(String envolvidos) {
        this.envolvidos = envolvidos;
    }


    public String getAlunosespc() {
        return alunosespc;
    }

    public void setAlunosespc(String alunosespc) {
        this.alunosespc = alunosespc;
    }

    public String getExtruturaex() {
        return extruturaex;
    }

    public void setExtruturaex(String extruturaex) {
        this.extruturaex = extruturaex;
    }

}
