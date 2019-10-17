package com.udfdevs.highlight.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity @Getter @Setter @NoArgsConstructor
public class Grupo {

    @Id
    @GeneratedValue(strategy="IDENTITY")
    private Integer id;
    
    @Column(name="nome")
    private String nome;

    @Column(name="gravadora")
    private String gravadora;

    @Column(name="ativo")
    private Boolean ativo;

    @Column(name="codigoFoto")
    private String codigoFoto;

    @Column(name="codigoFotoPerfil")
    private String codigoFotoPerfil;

}
