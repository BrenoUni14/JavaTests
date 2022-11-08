package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	Scanner in = new Scanner(System.in);

    float[] nota= new float[5];
    float soma = 0;
    float media;
    int i;

        System.out.println("Digite as 5 notas: \n");
        for(i = 0; i < 5; i++)
        {
            nota[i] = in.nextFloat();
            soma = soma + nota[i];
        }

        System.out.println("As notas são: ");
        for (i = 0; i < 5; i++)
        {
            System.out.println(nota[i]);
        }

        media = soma/5;
        System.out.println("\nA média das 5 notas é: "+media);
     */
        /*
        Scanner in = new Scanner(System.in);

        float vetor1[]= {33, 21, 45, 13, 3};
        float vetor2[]= {8, 4, 16, 28, 12};

        float vetorM[]= new float[5];

        float soma = 0, media;
        int i;

        for (i = 0; i < 5; i++)
        {
            vetorM[i] = (vetor1[i] + vetor2[i])/2;
            soma = soma + vetorM[i];
        }

        media = soma / 5;

        for (i = 0; i < 5; i++)
        {
            System.out.println("A posição "+i+" do terceiro vetor contém o valor: \n"+ vetorM[i]);
        }

        System.out.println("A média dos vslores contidos no terceiro vetor é: "+media);
         */
    /*
        int valor[] = new int[5];
        int i;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite os 5 valores do vetor: \n");
        for (i = 0; i < 5; i++)
        {
            valor[i] = in.nextInt();
        }

        System.out.println("\nPosições do vetor em ordem crescente: \n");
        for (i = 0; i < 5; i++)
        {
            System.out.println("A posição "+i+" do vetor possui o valor: \n"+valor[i]);
        }

        System.out.println("\nPosições do vetor em ordem descrescente: \n");
        for (i = 4; i >= 0; i--)
        {
            System.out.println("A posição "+i+" do vetor possui o valor: \n"+valor[i]);
        }

     */
/*

        float notas[] = new float[10];
        int i, apro = 0 , repro = 0;


        Scanner in = new Scanner(System.in);

        System.out.println("Leia todas as notas do vetor: \n");
        for (i = 0; i < 10; i++)
        {
            notas[i] = in.nextFloat();
            if (notas[i] >= 7)
            {
                apro++;
            }
            else
            {
                repro++;
            }
        }

        for (i = 0; i < 10; i++)
        {
            System.out.println("\nA posição " + i +" contém a nota: "+notas[i]);
        }
        System.out.println("\nTem "+apro+ " alunos aprovados!");
        System.out.println("\nTem "+repro+ " alunos reprovados!");

         */
        Scanner in = new Scanner(System.in);

        int vetor[] = new int[10];
        int i;
        int par, impar;



        System.out.println("Digite seus valores em números inteiros: \n");
        for (i = 0; i < 10; i++)
        {
            vetor[i] = in.nextInt();
            if (vetor[i] % 2 == 0)
            {
                par = vetor[i] * 10;
                vetor[i] = par;
            }
            else
            {
                impar = vetor[i] + 5;
                vetor[i] = impar;
            }
        }
        for (i = 0; i < 10; i++)
        {
            System.out.println("O resultado é: "+ vetor[i]);
        }

    }
}
