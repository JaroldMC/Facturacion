package org.example.ejemplo.modelo;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.Hidden;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Categoria {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Hidden
    @Column(length = 32)
    String oid;

    @Column(length = 50)
    String descripcion;
}