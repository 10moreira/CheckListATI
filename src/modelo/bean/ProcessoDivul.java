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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author mateus
 */
@Entity
@Table(name = "ProcessoDivul")
public class ProcessoDivul implements Serializable{
   
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "SEQ_ProcessoDiv", sequenceName = "GEN_ProcessoDiv_Id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ProcessoDiv")
    private int id;
    
    @Column(name = "tipodivulg", length = 200, nullable = false)
    private String tipodivulg;
    
    @Column(name = "convite", length = 200, nullable = false)
    private String convite;

    

    public ProcessoDivul() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

   

 
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.id);
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
        final ProcessoDivul other = (ProcessoDivul) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  tipodivulg;
    }

    public String getConvite() {
        return convite;
    }

    public void setConvite(String convite) {
        this.convite = convite;
    }

    public String getTipodivulg() {
        return tipodivulg;
    }

    public void setTipodivulg(String tipodivulg) {
        this.tipodivulg = tipodivulg;
    }
    
    
    
}
