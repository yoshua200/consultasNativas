package com.mx.agenciamotos.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;


import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "MOTOS_DEPORTIVAS")
@Data
public class motosDeportivas {

    @Id
   /* @Column(name="id")
    private Integer id; */
    @Column(name="N_SERIE")
    private String nSerie;
    @Column(name="C_C")
    private int cc;
    @Column(name="VELOCIDADMAX")
    private int velocidadmax;
    @Column(name="MARCA")
    private String marca;
    @Column(name="MODELO")
    private String modelo;
    @Column(name="ANIO")
    private int anio;
    @Column(name="COLOR")
    private String color;
    @Column (name="PRECIO")
    private int precio;

   //cada moto puede tener una agencia
   @JsonIgnore
   @ManyToMany(mappedBy = "motos")
   private List<detallesAgencias> agencias = new ArrayList<>();


}
