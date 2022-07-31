/*
package com.alkemy.icons.icons.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="pais")
@Getter
@Setter
public class PaisEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String imagen;
    private String denominacion;
    @Column(name= "cant_habitantes")//como buena práctica no se usa camelCase en bbdd
    private Long cantidadHabitantes;
    private Long superficie; //m2
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    //fetchType.EAGER significa que la inicialización será de tipo temprana
    //es decir, cuando obtenga un dato de tipo país si o sí vendrá con sus cont
    //cascade quiere decir que si hago un delete se aplicará sobre el continente también
    @JoinColumn(name= "continent_id", insertable = false, updatable = false)
    //el name me dice con qué joineo y es false en ambos porque solo lo utilizo para obtener información
    private ContinenteEntity continente;
    @Column (name="continente_id", nullable = false)
    private Long continenteId;

    @ManyToMany(
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(
            name="icon_pais",
            joinColumns = @JoinColumn(name="pais_id"),
            inverseJoinColumns = @JoinColumn(name = "icon_id"))
    private Set<IconEntity> icons = new HashSet<>();
    @Override
    public boolean equals(Object obj){//acá se redefine la comparación de países
        if(obj == null)
            return false;
        if(getClass()!= obj.getClass())
            return false;
        final PaisEntity other = (PaisEntity) obj;
        return other.id == this.id;
    }
}
*/