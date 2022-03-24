// Faça um programa que sorteie 1000 números inteiros ( de 1 até 100) e calcule a média, o valor máximo e o valor mínimo.

import java.util.Random;

public class Sorteio {
    //Atributos, propriedades, variáveis globais.


    // Funções e procedimentos


    // rotina principal
    public static void main(String[] args) {
        Random gerador = new Random();
        int c =1;
        int maior = 0;
        int menor = 0;
        int soma = 0;
       while (c <=1000){
        // ler o numero
        int n = 1 + gerador.nextInt(100);
        
        System.out.println(n);

        if (c == 1) {
            maior = n;
            menor = n;
        }

        soma = soma +n;

        if (n > maior) {
            maior = n;
            
        }
        
        if (n < menor) {
            menor = n;
        }
        c++;

       }

       System.out.println("O numero maior é: " + maior);
       System.out.println("O numero menor é: " + menor);
       System.out.println("Média é: " + soma / 1000f);
    }
}