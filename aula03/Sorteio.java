import java.util.Random;

public class Sorteio {
    //Atributos, propriedades, variáveis globais.


    // Funções e procedimentos


    // rotina principal
    public static void main(String[] args) {
        Random gerador = new Random();
        int c =1;
       while (c <=1000){
        // ler o numero
        int n = 1 + gerador.nextInt(100);
        c++;
        System.out.println(n);

       }
    }
    
}