package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();


        //for que armazena temperatura na lista
        for(int i=0; i<6; i++){
            System.out.print("Digite a temperatura: ");
            double temperatura = sc.nextDouble();
            temperaturas.add(temperatura);
        }


        //Lambda que imprime todas as temperaturas da lista
        System.out.println("Todas as temperaturas: ");
        temperaturas.forEach(t -> System.out.println(t + " "));


        //media das temperaturas
        Iterator<Double> iterator = temperaturas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Media: " + soma/temperaturas.size());

        //media das temperaturas
        double media = temperaturas.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0d);
        System.out.printf("\nMédia das temperaturas: %.1f\n", media);

        //temperaturas acima da media
        Iterator<Double> iterator1 = temperaturas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(media < next) {
                System.out.println("Temperaturas acima da media: " + next);
            }
        }

        //exibindo as temperaturas acima da média
        System.out.println("Temperaturas acima da média: ");
        temperaturas.stream()
                .filter(t -> t > media)
                .forEach(t -> System.out.printf("%.1f ", t));


        System.out.println("\n\nMeses das temperaturas acima da média: ");
        Iterator<Double> iterator2 = temperaturas.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            Double temp = iterator.next();
            if (temp > media) {
                switch (count) {
                    case (0):
                        System.out.printf("1 - janeiro: %.1f\n ", temp);
                        break;
                    case (1):
                        System.out.printf("2 - fevereiro: %.1f\n", temp);
                        break;
                    case (2):
                        System.out.printf("3 - março: %.1f\n", temp);
                        break;
                    case (3):
                        System.out.printf("4 - abril: %.1f\n", temp);
                        break;
                    case (4):
                        System.out.printf("5 - maio: %.1f\n", temp);
                        break;
                    case (5):
                        System.out.printf("6 - junho: %.1f\n", temp);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }
            }
            count++;
        }

    }


}
