package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        Set<LinguagemFavorita> minhasLinguagensFavoritas = new HashSet<>();

        LinguagemFavorita l1 = new LinguagemFavorita("Python", 1991, "Pycharm");
        LinguagemFavorita l2 = new LinguagemFavorita("JavaScript", 1995, "IntelliJ");
        LinguagemFavorita l3 = new LinguagemFavorita("Java", 1991, "Visual Studio Code");

        minhasLinguagensFavoritas.addAll(Arrays.asList(l1, l2, l3));

        System.out.println("--------\tOrdem de Inserção\t--------");
        Set<LinguagemFavorita> lF1 = new LinkedHashSet<>();
        lF1.addAll(Arrays.asList(l1, l2, l3));
        for(LinguagemFavorita lfList : lF1){
            System.out.println(lfList);
        }


        System.out.println("--------\tOrdem Natural: Nome\t--------");
        Set<LinguagemFavorita> lF2 = new TreeSet<>(minhasLinguagensFavoritas);
        for(LinguagemFavorita lfList : lF2){
            System.out.println(lfList);
        }

        System.out.println("--------\tOrdem IDE\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas3 = new TreeSet<LinguagemFavorita>(new ComparatorIde());
        minhasLinguagensFavoritas3.addAll(minhasLinguagensFavoritas);
        for(LinguagemFavorita lfList : minhasLinguagensFavoritas3){
            System.out.println(lfList);
        }

        System.out.println("--------\tOrdem Ano de Criacao e Nome\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas4 = new TreeSet<LinguagemFavorita>(new ComparatorAnoDeCriacaoENome());
        minhasLinguagensFavoritas4.addAll(minhasLinguagensFavoritas);
        for(LinguagemFavorita lfList : minhasLinguagensFavoritas4){
            System.out.println(lfList);
        }

        System.out.println("--------\tOrdem Nome - Ano de Criacao - IDE\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas5 = new TreeSet<LinguagemFavorita>(new ComparatorNomeAnoDeCriacaoIde());
        minhasLinguagensFavoritas5.addAll(minhasLinguagensFavoritas);
        for(LinguagemFavorita lfList : minhasLinguagensFavoritas5){
            System.out.println(lfList);
        }
    }
}
