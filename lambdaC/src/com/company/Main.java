package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Contato c1 = new Contato("Simba", 5555);
        Contato c2 = new Contato("Cami", 1111);
        Contato c3 = new Contato("Jon", 2222);

        Map<Integer, Contato> agenda = new HashMap<>();
        agenda.put(1, c1);
        agenda.put(2, c2);
        agenda.put(3, c3);

        System.out.println(agenda + "\n");

        //  Percorrendo toda lista de agenda, imprimindo apenas a chave e o nome
        System.out.println("\n--\tOrdem aleatória\t--");
        for(Map.Entry<Integer, Contato> entry: agenda.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("\n--\tOrdem Inserção\t--");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>();
        agenda1.put(1, c3);
        agenda1.put(2, c1);
        agenda1.put(3, c2);
        for(Map.Entry<Integer, Contato> entry: agenda1.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("\n--\tOrdem id\t--");
        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);
        System.out.println(agenda2 + "\n");
        for(Map.Entry<Integer, Contato> entry: agenda2.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("\n--\tOrdem número telefone\t--");
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(x -> x.getValue().getNumero()));
        set.addAll(agenda.entrySet());
        for(Map.Entry<Integer, Contato> entry: set){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ": " +entry.getValue().getNome());
        }


        System.out.println("\n--\tOrdem número telefone\t--");
        Set<Map.Entry<Integer, Contato>> set2 = new TreeSet<>(Comparator.comparing(x -> x.getValue().getNome()));
        set2.addAll(agenda.entrySet());
        for(Map.Entry<Integer, Contato> entry: set2){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
    }
}
