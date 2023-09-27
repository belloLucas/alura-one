package br.com.alura.loja.modelo;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class DadosPessoais implements Serializable {

    private static final long serialVersionUID = 1l;
    private String nome;
    private String cpf;

    public DadosPessoais(){}

    public DadosPessoais(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
