package com.udfdevs.highlight.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Date;

@Entity @Getter @Setter @NoArgsConstructor
public class Album {
    private Integer id;
    private String nome;
    private TipoDeAlbum tipo;
    private Date dataDeLancamento;

}
