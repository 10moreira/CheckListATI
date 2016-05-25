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
@Table(name = "Projeto")
public class Projeto implements Serializable{  
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "SEQ_Proj", sequenceName = "GEN_Proj_Id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_Proj")
    private int id;
        
    @Column(name = "tipoproj", length = 500, nullable = false)
    private String tipoproj;
    
    @ManyToOne
    @JoinColumn(name = "setor", referencedColumnName = "id", nullable = false)
    private Setor setor;
    
    
    public Projeto() {
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
        hash = 53 * hash + Objects.hashCode(this.id);
        return hash;
    }


    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
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
        final Projeto other = (Projeto) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return tipoproj;
    }

    public String getTipoproj() {
        return tipoproj;
    }

    public void setTipoproj(String tipoproj) {
        this.tipoproj = tipoproj;
    }
    
}
