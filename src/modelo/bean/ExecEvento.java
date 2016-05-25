/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bean;

import java.io.Serializable;
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
@Table(name = "ExecEvento")
public class ExecEvento implements Serializable {

    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "SEQ_ExecEv", sequenceName = "GEN_ExecEv_Id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ExecEv")
    private int id;

    @Column(name = "execucao", length = 150, nullable = false)
    private String execucao;

    
    @ManyToOne
    @JoinColumn(name = "nomesetor", referencedColumnName = "id", nullable = false)
    private Setor nomesetor;
    

    public ExecEvento() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.id;
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
        final ExecEvento other = (ExecEvento) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    
    public String getExecucao() {
        return execucao;
    }

    public void setExecucao(String execucao) {
        this.execucao = execucao;
    }

    @Override
    public String toString() {
        return execucao;
    }

    public Setor getNomesetor() {
        return nomesetor;
    }

    public void setNomesetor(Setor nomesetor) {
        this.nomesetor = nomesetor;
    }
    
}
