package Formativa;

import java.util.Scanner;
import java.util.Random;

public class Exercicios {
    public void exercicio1() {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Digite o número de linhas");
        int linhas = scanner.nextInt();
        System.out.println("Digite o número de colunas");
        int colunas = scanner.nextInt();
        int matriz[][] = new int[linhas][colunas];

        // preenchendo minha matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = rd.nextInt(9);
            }
        }

        // impressão da matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("=========");

        // substituindo os valores
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i > j)
                    matriz[i][j] = 1;
                else if (i == j)
                    matriz[i][j] = 0;
                else if (j > i)
                    matriz[i][j] = 2;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public void exercicio2() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int sorteado = rd.nextInt(1000);
        int nTentativas = 0;
        boolean palpites = true;
        while (palpites = true) {
            nTentativas++;
            System.out.println("Digite um número");
            int nDigitado = sc.nextInt();
            if (nDigitado == sorteado) {
                System.out.println("Parabéns, você acertou em " + nTentativas + " tentativas!");
                palpites = false;
            } else if (nDigitado > sorteado) {
                System.out.println("Ih, rapaz... errou! O número sorteado é menor");
            } else if (nDigitado < sorteado) {
                System.out.println("Ih, rapaz... errou! O número sorteado é maior");
            }
        }

    }

    public void exercicio3() {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        int tamanho = rd.nextInt(100, 1000);
        int vetor[] = new int[tamanho];

        //listando e imprimindo o vetor 
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(100);
            int calculo = vetor[i]%2;
            if (calculo==0) {
                System.out.println("O vetor["+i+"] = "+vetor[i]+ " é par");
            }else{
                System.out.println("O vetor ["+i+"] = "+vetor[i]+ " é impar");
            }
        }
    }
}
