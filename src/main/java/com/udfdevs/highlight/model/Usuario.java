package com.udfdevs.highlight.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity @Getter @Setter @NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy="IDENTITY")
    private Integer id;

    @Column(name="nome")
    private String nome;

    @Column(name="usuario")
    private String usuario;

    @Column(name="senha")
    private String senha;

    @Column(name="email")
    private String email;

}
