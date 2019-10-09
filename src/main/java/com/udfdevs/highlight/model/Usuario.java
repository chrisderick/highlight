package com.udfdevs.highlight.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity @Getter @Setter @NoArgsConstructor
public class Usuario {
    private Integer id;
    private String nome;
    private String usuario;
    private String senha;
    private String email;

}
