import java.util.Random;
import java.util.Scanner;

public class Loteria {
    // atributos
    public static Scanner teclado;
     
   
    //rotina principal
    public static void main(String[] args) {
        System.out.println("Bem vindo a Loteria feita em Java!:");

        // carregar os números sorteados pelo Random em um vetor "sorteados"
        int[] sorteados;
        Random gerador = new Random();
        sorteados = new int[6];
        for(int i = 0; i < sorteados.length; i++){
            sorteados[i] = gerador.nextInt(60) + 1;
        }

        //carregar os palpites do usuario em um vetor "palpites"
        //validar se é entre 1 e 60
        int[]  palpites = new int[6];
        teclado = new Scanner(System.in);

            
            int num = 0;
            int cont = 0;
        do {
            
            System.out.println("Informe um número de 1 a 60");
            num = teclado.nextInt();
         
             if (num > 0 && num < 60){
                palpites[cont] = num;
                cont ++;
             }else{
                System.out.println("Digite um número válido");
             }
        } while (cont < palpites.length);
       
       
        //Mostrar os numeros que foram sorteados pelo Random
        System.out.println("Os numeros Sorteados foram: ");
        for (int i = 0; i < sorteados.length; i++) {
            System.out.println(sorteados[i] + " ");
        }

        //Mostrar os numeros que foram escolhidos pelo usuario
        System.out.println("Os numeros escolhidos foram: ");
        for (int i = 0; i < palpites.length; i++) {
            System.out.println(palpites[i] + " ");
        }
    
        teclado.close();
         //Validar se os numeros sorteados são iguais aos numeros do usuario
         int acertos = 0;

         for (int i = 0; i < palpites.length; i++) {
             for (int j = 0; j < sorteados.length; j++) {
                 if (palpites[i] == sorteados[j]) {
                     acertos++;     
                 }
             }
         }

        
         if (acertos == 6) {
            System.out.println("Parabens, você acertou 6 numeros e ganhou R$ 1.000.000,00. Vá até a casa loterica mais proxima para retirar sua recompensa.");
        } else if (acertos == 5) {
            System.out.println("Parabens, você acertou 5 numeros e ganhou R$ 250.000,00. Vá até a casa loterica mais proxima para retirar sua recompensa.");
        } else if (acertos == 4) {
            System.out.println("Parabens, você acertou 4 numeros e ganhou R$ 50.000,00. Vá até a casa loterica mais proxima para retirar sua recompensa.");
        } else {
            System.out.println("Infelizmente, você não ganhou desta vez.");
        }

    }// main
}// classe
