package entities;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

import java.io.Serializable;
@Entity
@Table(name="localidad")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Audited

public class Localidad extends Base{


    @Column(name = "denominacion")
    private String denominacion;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_Domicilio")
    private Domicilio domicilio;


}
