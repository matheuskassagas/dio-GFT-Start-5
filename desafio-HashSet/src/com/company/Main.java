package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("violeta");
        coresArcoIris.add("anil");
        coresArcoIris.add("azul");
        coresArcoIris.add("verde");
        coresArcoIris.add("amarelo");
        coresArcoIris.add("laranja");
        coresArcoIris.add("vermelho");

        //Imprimir posicoes uma embaixo da outra
        Iterator<String> iterator = coresArcoIris.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
        //Imprimir posicoes uma embaixo da outra
        System.out.println("Exiba todas as cores o arco-íris uma abaixo da outra: ");
        for (String cor : coresArcoIris) {
            System.out.println(cor);
        }

        //Quantidade de cores do arco iris
        System.out.printf("O arco iris tem %d cores", coresArcoIris.size());

        System.out.println("\nExiba as cores em ordem alfabética: ");
        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIris2);


        //Exibindo as cores inversa da lista
        Set<String> arcoIres2 = new LinkedHashSet<>();
        arcoIres2.add("violeta");
        arcoIres2.add("anil");
        arcoIres2.add("azul");
        arcoIres2.add("verde");
        arcoIres2.add("amarelo");
        arcoIres2.add("laranja");
        arcoIres2.add("vermelho");
        System.out.println("Ordem inserida: " + arcoIres2);
        List<String> ordemInversa = new ArrayList<>(arcoIres2);
        Collections.reverse(ordemInversa);
        System.out.println("Ordem inversa: " + ordemInversa);

        //Exibindo palavras que começam com letra V
        Iterator<String> iterator2 = coresArcoIris.iterator();
        while (iterator2.hasNext()) {
            String next = iterator2.next();
            if (next.startsWith("v")) {
                System.out.println(next);
            }
        }

        //Exibindo palavras que começam com letra V
        for (String stratV : coresArcoIris) {
            if (stratV.startsWith("v")) {
                System.out.println(stratV);
            }
        }

        System.out.println("Remova todas as cores que não começam com a letra “v”: ");
        Iterator<String> iterator3 = coresArcoIris.iterator();
        while (iterator3.hasNext()) {
            if (!iterator3.next().startsWith("v")) iterator3.remove();
        }
        System.out.println(coresArcoIris);

        System.out.println("Limpe o conjunto: ");
        coresArcoIris.clear();

        System.out.println("Confira se o conjunto está vazio: " + coresArcoIris.isEmpty());
    }


}




