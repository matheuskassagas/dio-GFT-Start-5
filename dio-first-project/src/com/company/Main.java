package com.company;

import com.company.entity.Gato;

import java.util.Objects;

public class Main {

        public static void main(String[] args) {
            int a = 5;
            int b = 3;

            System.out.println("hello world \n" + (a+b));

            Gato cat1 = new Gato();

            System.out.println(cat1);

            Livro livro1 = new Livro("Livro sem nome", 1000);

            System.out.println(livro1);
    }
    
}

class Livro {
    public String name;
    public Integer numberPage;

    public Livro() {
    }

    public Livro(String name, Integer numberPage) {
        this.name = name;
        this.numberPage = numberPage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(Integer numberPage) {
        this.numberPage = numberPage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(name, livro.name) && Objects.equals(numberPage, livro.numberPage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberPage);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Livro{");
        sb.append("name='").append(name).append('\'');
        sb.append(", numberPage=").append(numberPage);
        sb.append('}');
        return sb.toString();
    }
}
