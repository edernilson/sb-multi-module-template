package com.edernilson.pluginapp.infra.model;

import com.edernilson.pluginapp.infra.model.util.HstoreUserType;
import lombok.Data;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Data
@TypeDefs({
        @TypeDef(name = "hstore", typeClass = HstoreUserType.class)
})
@Table
@Entity
public class Pedido extends EntidadeBase {

    private static final long serialVersionUID = 4466985306493698291L;

    @Temporal(TemporalType.DATE)
    private Date data;
    private String numero;

    @Type(type = "hstore")
    @Column(columnDefinition = "hstore")
    private Map<String, String> atributos = new HashMap<>();
}

