package org.example.ejemplo.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Embeddable
@Getter
@Setter
public class Direccion {

    @Column(length = 30)
    String departamento;

    @Column(length = 5)
    int codigoPostal;

    @Column(length = 20)
    String municipio;

    @Column(length = 30)
    String provincia;
}