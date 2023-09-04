package com.utn.ejer02.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Entity
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Persona implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long idCliente;
    private String nombre;
    private String apellido;
    private int edad;
    // RELACION ONE TO ONE UNIDIRECCIONAL
    // El Cascadeo propaga las operaciones y orphanRemoval asegura que se elimine la relacionada
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "domicilio_id")

    private Domicilio domicilio;

    public Long getId() {
    }
}
