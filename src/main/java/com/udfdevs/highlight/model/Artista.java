package com.udfdevs.highlight.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

//TODO: Excluir o nome romanizado do diagrama de classe
@Entity @Getter @Setter @NoArgsConstructor
public class Artista {
    private Integer id;
    private String nome;
    private Boolean cor;
    private String codigoFoto;

}
