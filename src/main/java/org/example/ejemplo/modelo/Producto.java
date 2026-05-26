package org.example.ejemplo.modelo;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Producto {

    @Id
    @Column(length=9)
    int numero;

    @Column(length=50)
    @Required
    String descripcion;

    @ManyToOne(
            fetch = FetchType.LAZY,
            optional = true)
    @DescriptionsList
    Categoria categoria;

    @ManyToOne(fetch = FetchType.LAZY)
    @DescriptionsList
    Autor autor;

    @Money
    BigDecimal precio;

    @Files
    @Column(length=32)
    String fotos;

    @TextArea
    String observaciones;
}