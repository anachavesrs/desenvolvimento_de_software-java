import java.util.Random;

public class Sorteio {
    //Atributos, propriedades, variáveis globais.


    // Funções e procedimentos


    // rotina principal
    public static void main(String[] args) {
        Random gerador = new Random();
        int n = 1 + gerador.nextInt(100);
        System.out.println(n);
    }
    
}