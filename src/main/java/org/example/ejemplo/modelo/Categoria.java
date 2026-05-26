package org.example.ejemplo.modelo;


import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.Hidden;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Categoria {
    @Id
    @Hidden
    @GeneratedValue(generator = "system-uuid")

}
