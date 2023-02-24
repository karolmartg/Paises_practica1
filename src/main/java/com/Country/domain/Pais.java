package com.Country.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "estado")
public class Pais implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstado;
    
    private String nombre_estado;
    private String capital;
    private Integer poblacion;
    private Integer costas;
    
    // Constructor Generico
    public Pais() {
    }
    
    // Constructor Especifico
    public Pais(String nombre_estado, String capital, Integer poblacion, Integer costas) {
        this.nombre_estado = nombre_estado;
        this.capital = capital;
        this.poblacion = poblacion;
        this.costas = costas;
    }
    
}