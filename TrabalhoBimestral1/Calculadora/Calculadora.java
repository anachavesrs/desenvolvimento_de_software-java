import java.util.Scanner;

public class Calculadora {
    //atributos
    //funções e procedimentos
    public static int soma(int a, int b){
        int resultado = a + b;
        return resultado;    
    }
    public static int subtracao(int a, int b){
        int resultado = a - b;
        return resultado;
    }
    public static int multiplicacao(int a, int b){
        int resultado = a * b;
        return resultado;
    }
    public static float divisao(int a, int b){
        float resultado = a / (float)b;
        return resultado;
    }
    
    //Função principal 

    public static void main(String[] args) { 
        System.out.println("Calculadora Feita em Java");
        System.out.println("Selecione a operação matemática que deseja fazer:");
        Scanner sc = new Scanner(System.in); //permitir entrada de dados
        System.out.println("Digite 1 para somar");
        System.out.println("Digite 2 para subtrair");
        System.out.println("Digite 3 para multiplicar");
        System.out.println("Digite 4 para dividir.");
        int calcular = sc.nextInt(); //armazenar o dado de entrada em uma variavel "calcular"
        System.out.println("Digite o primeiro número para ser calculado");
        int n1 = sc.nextInt(); // armazenar o primeiro n em uma variavel n1
        System.out.println("Digite mais um número para ser calculado");
        int n2 = sc.nextInt(); // guardar o segundo n em uma variavel n2

        // testar qual a operação escolhida pelo usuário e excecutar o calculo
        switch (calcular) {
            case 1:
                System.out.println("Segue resultado abaixo:");
                System.out.println(soma(n1, n2));   

                break;
            case 2:
                System.out.println("Segue resultado abaixo:");
                System.out.println(subtracao(n1, n2));   
                break;
            case 3:
                System.out.println("Segue resultado abaixo:");
                System.out.println(multiplicacao(n1, n2));   
                break;
            case 4:
                System.out.println("Segue resultado abaixo:");
                System.out.println(divisao(n1, n2));   
                break;
            default:
                break;
        }  
        sc.close(); //fim da entrada de dados
    }
        

   
} //fim da classe calculadora
