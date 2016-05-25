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
@Table(name = "Atividade")
public class Atividade implements Serializable{
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "SEQ_Ativi", sequenceName = "GEN_Ativi_Id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_Ativi")
    private int id;
    
    @Column(name = "tipoatividade", length = 200, nullable = false)
    private String tipoatividade;
    
    @Column(name = "especificaatividade", length = 200, nullable = false)
    private String especificaatividade;

    @ManyToOne
    @JoinColumn(name = "projeto", referencedColumnName = "id", nullable = false)
    private Projeto projeto;
    
    @ManyToOne
    @JoinColumn(name = "nomesetor", referencedColumnName = "id", nullable = false)
    private Setor nomesetor;
    
    @ManyToOne
    @JoinColumn(name = "processodivul", referencedColumnName = "id", nullable = false)
    private ProcessoDivul processodivul;
   
    
    public Atividade() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.id);
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
        final Atividade other = (Atividade) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

   

    @Override
    public String toString() {
        return tipoatividade;
    }

    public String getTipoatividade() {
        return tipoatividade;
    }

    public void setTipoatividade(String tipoatividade) {
        this.tipoatividade = tipoatividade;
    }

    public String getEspecificaatividade() {
        return especificaatividade;
    }

    public void setEspecificaatividade(String especificaatividade) {
        this.especificaatividade = especificaatividade;
    }

    public Setor getNomesetor() {
        return nomesetor;
    }

    public void setNomesetor(Setor nomesetor) {
        this.nomesetor = nomesetor;
    }

    public ProcessoDivul getProcessodivul() {
        return processodivul;
    }

    public void setProcessodivul(ProcessoDivul processodivul) {
        this.processodivul = processodivul;
    }

   
  
    
    
}
