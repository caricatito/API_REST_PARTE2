package entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.engine.internal.Cascade;
import org.hibernate.envers.Audited;

import java.io.Serializable;
@Entity
@Table(name="domicilio")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Audited
public class Domicilio extends Base {

    @Column(name = "calle")
    private String calle;

    @Column(name = "num")
    private int num;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_persona")
    private Persona persona;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;


}

