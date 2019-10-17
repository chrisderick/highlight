package com.udfdevs.highlight.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Date;

@Entity @Getter @Setter @NoArgsConstructor
public class Album {
    
    @Id
    @GeneratedValue(strategy="IDENTITY")
    private Integer id;

    @Column(name="nome")
    private String nome;

    @Column(name="tipo")
    private TipoDeAlbum tipo;

    @Column(name="dataDeLancamento")
    private Date dataDeLancamento;

}
