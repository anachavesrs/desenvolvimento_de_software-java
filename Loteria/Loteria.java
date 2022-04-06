import java.util.Random;
import java.util.Scanner;

public class Loteria {
    // atributos
    public static Scanner teclado;
    public static int[] sorteados;
   

    //funcoe e procedimentos
    public static void sortear(){
        Random gerador = new Random();
        sorteados = new int[6];
        for(int i = 0; i < sorteados.length; i++){
            sorteados[i] = gerador.nextInt(60) + 1;
        }
    }

    


   

    //rotina principal
    public static void main(String[] args) {
        System.out.println("Bem vindo a Loteria feita em Java!:");
        sortear();
        int[]  palpites = new int[6];
        teclado = new Scanner(System.in);


           /* for ( int i = 0; i >= 6; i++){
                System.out.println("Informe um número de 1 a 60");
                palpites[i] = teclado.nextInt();
            }*/
            int i = 0;
        do {
             System.out.println("Informe um número de 1 a 60");
             palpites[i] = teclado.nextInt();
        }

       
        teclado.close();
    }
}
