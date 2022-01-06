package br.dev.magliano.digitalmanufacturingnetwork.workshop;

import javax.persistence.*;

@Entity
public class Workshop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nome;
    private String estado;
    private String cep;

    public Workshop(String nome, String estado, String cep) {
        this.nome = nome;
        this.estado = estado;
        this.cep = cep;
    }
}
