package com.udfdevs.highlight.model;

public class Letra {

    @Id
    @GeneratedValue(strategy="IDENTITY")
    private Integer id;

    @Column(name="codigoArquivo")
    private String codigoArquivo;

    @Column(name="tipo")
    private TipoDeLetra tipo;

    //TODO: Ajustar campo/relacionamento no db
    private Faixa faixa;

    //TODO: Mapear Relacionamento
    private Usuario usuario;
}
