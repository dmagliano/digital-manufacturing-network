package br.dev.magliano.digitalmanufacturingnetwork.workshop;

public class WorkshopRequestDTO {

    private String nome;
    private String estado;
    private String cep;

    public String getNome() {
        return nome;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public Workshop toEntity(){
        return new Workshop(
                this.nome,
                this.estado,
                this.cep
        );
    }
}
