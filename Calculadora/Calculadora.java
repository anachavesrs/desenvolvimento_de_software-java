import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Calculadora Feita em Java");
        System.out.println("Selecione a operação matemática que deseja fazer:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 1 para somar");
        System.out.println("Digite 2 para subtrair");
        System.out.println("Digite 3 para multiplicar");
        System.out.println("Digite 4 para dividir");
        
        sc.close();
    }

    public static int soma(int a, int b){
        int resultado = a + b;
        return resultado;
        
    }
    
}
