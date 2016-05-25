/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bean;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author mateus
 */
@Entity
@Table(name = "Setor")
public class Setor implements Serializable{
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "SEQ_Set", sequenceName = "GEN_Set_Id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_Set")
    private int id;
    
    @Column(name = "parceiroexterno", length = 40)
    private String parceiroexterno;
    
    @Column(name = "centro", length = 40, nullable = false)
    private String centro;
    
    @Column(name = "titulo", length = 40, nullable = false)
    private String titulo;
    
    @Column(name="datsetor") 
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar datsetor;
    
    @Column(name="horario") 
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar horario;
    
    @Column(name = "localsetor", length = 40, nullable = false)
    private String localsetor;
    
    @Column(name = "envolvido", length = 200, nullable = false)
    private String envolvido;
       
    @Column(name = "campus", length = 100, nullable = false)
    private String campus;
    
    public Setor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.id);
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
        final Setor other = (Setor) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

   

    public Calendar getHorario() {
        return horario;
    }

    public void setHorario(Calendar horario) {
        this.horario = horario;
    }

   

    public String getEnvolvido() {
        return envolvido;
    }

    public void setEnvolvido(String envolvido) {
        this.envolvido = envolvido;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    @Override
    public String toString() {
        return localsetor;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getParceiroexterno() {
        return parceiroexterno;
    }

    public void setParceiroexterno(String parceiroexterno) {
        this.parceiroexterno = parceiroexterno;
    }

    public Calendar getDatsetor() {
        return datsetor;
    }

    public void setDatsetor(Calendar datsetor) {
        this.datsetor = datsetor;
    }

    public String getLocalsetor() {
        return localsetor;
    }

    public void setLocalsetor(String localsetor) {
        this.localsetor = localsetor;
    }
    
}
