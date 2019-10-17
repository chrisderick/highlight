package com.udfdevs.highlight.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

//TODO: Excluir o nome romanizado do diagrama de classe
@Entity @Getter @Setter @NoArgsConstructor
public class Artista {

    @Id
    @GeneratedValue(strategy="IDENTITY")
    private Integer id;

    @Column(name="nome")
    private String nome;

    @Column(name="cor")
    private Boolean cor;

    @Column(name="codigoFoto")
    private String codigoFoto;

}
