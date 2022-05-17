package com.company;

import java.util.Comparator;
import java.util.Objects;

public class LinguagemFavorita implements Comparable<LinguagemFavorita>{

    public String nome;
    public Integer anoDeCriacao;
    public String ide;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(nome);
        sb.append(" | Ano de Criação: ").append(anoDeCriacao);
        sb.append(" | Ide: ").append(ide);
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return nome.equals(that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
        return this.nome.compareTo(linguagemFavorita.nome);
    }
}

class ComparatorIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        return o1.ide.compareToIgnoreCase(o2.ide);
    }
}

class ComparatorAnoDeCriacaoENome implements Comparator <LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int anoDeCriacao = Integer.compare(o1.anoDeCriacao, o2.anoDeCriacao);
        if(anoDeCriacao != 0) {
            return anoDeCriacao;
        }
        return o1.nome.compareToIgnoreCase(o2.nome);
    }
}

class ComparatorNomeAnoDeCriacaoIde implements Comparator <LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int nome = o1.nome.compareToIgnoreCase(o2.nome);
        int anoDeCriacao = Integer.compare(o1.anoDeCriacao, o2.anoDeCriacao);
        if ( nome != 0){
            return nome;
        }
        if (anoDeCriacao != 0){
            return anoDeCriacao;
        }
        return o1.ide.compareToIgnoreCase(o2.ide);
    }
}


