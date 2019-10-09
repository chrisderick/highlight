package com.udfdevs.highlight.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.List;

//TODO: Revisar os atributos creditos, letra e o tipo do atributo duracao
@Entity @Getter @Setter @NoArgsConstructor
public class Faixa {
    private Integer id;
    private String nome;
    private String duracao;
    private String creditos;
    private List<Letra> letras;

}
