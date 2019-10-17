package com.udfdevs.highlight.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.List;

//TODO: Revisar os atributos creditos, letra e o tipo do atributo duracao
@Entity @Getter @Setter @NoArgsConstructor
public class Faixa {

    @Id
    @GeneratedValue(strategy="IDENTITY")
    private Integer id;

    @Column(name="nome")
    private String nome;

    @Column(name="duracao")
    private String duracao;

    //Pode ser nulo
    @Column(name="creditos")
    private String creditos;

    //Mapear relaciomento
    private List<Letra> letras;

}
