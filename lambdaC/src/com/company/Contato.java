package com.company;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class Contato {
    private String nome;
    private Integer numero;

    public Contato(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return nome.equals(contato.nome) && numero.equals(contato.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numero);
    }

    @Override
    public String toString() {
        return "Contato: " +
                "Nome: " + nome + " | " +
                "Numero: " + numero ;
    }
}

class ComparatorNum implements Comparator<Map.Entry<Integer, Contato>>{

    @Override
    public int compare(Map.Entry<Integer, Contato> o1, Map.Entry<Integer, Contato> o2) {
        return Integer.compare(o1.getValue().getNumero(), o2.getValue().getNumero());
    }
}
