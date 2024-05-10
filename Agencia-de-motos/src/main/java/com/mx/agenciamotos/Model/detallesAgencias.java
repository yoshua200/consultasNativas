package com.mx.agenciamotos.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="AGENCIAS")
@Data

public class detallesAgencias {


    @Id
    @Column(name="ID_AGENCIA")
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAgencia;

    @Column(name="DIRECCION")
    private String direccion;

    @Column(name="TELEFONO")
    private String telefono;

   @Column(name="FK_NSERIE")
    private String nSerie;

// cada agencia puede tener muchas motos
@JsonIgnore
@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
@JoinTable(name = "agencias_motos",
        joinColumns = @JoinColumn(name = "agencia_id", referencedColumnName = "ID_AGENCIA"),
        inverseJoinColumns = @JoinColumn(name = "moto_id", referencedColumnName = "N_SERIE"))
private List<motosDeportivas> motos = new ArrayList<>();

}