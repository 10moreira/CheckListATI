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
@Table(name = "PosExec")
public class PosExec implements Serializable{
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "SEQ_PosEx", sequenceName = "GEN_PosEx_Id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PosEx")
    private int id;
          
    @Column(name = "avaliado", length = 100, nullable = false)    
    private String avaliado;

    @ManyToOne
    @JoinColumn(name = "execevento", referencedColumnName = "id", nullable = false)
    private ExecEvento execevento;
    
    
    
    public PosExec() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.id;
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
        final PosExec other = (PosExec) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public String getAvaliado() {
        return avaliado;
    }

    public void setAvaliado(String avaliado) {
        this.avaliado = avaliado;
    }

    public ExecEvento getExecevento() {
        return execevento;
    }

    public void setExecevento(ExecEvento execevento) {
        this.execevento = execevento;
    }

 
}
