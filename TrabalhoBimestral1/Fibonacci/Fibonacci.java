import java.util.Scanner;

public class Fibonacci {
//Atributos
//Funções e procedimentos / Função que calcula o fibonacci

 static long fibonacciN(int x){
   if (x == 0) {
      int resultado = 0;
       return resultado;

   }else if (x == 1){
    int resultado = 1;
     return resultado; 

   }else{
       return fibonacciN(x-1) + fibonacciN(x-2);
       
   }
}
// Função principal
public static void main(String[] args) {
    System.out.println("Programa Fibonacci feito em Java!");
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o número que deseja calcular: ");
    int nEsimo;
    nEsimo = sc.nextInt();

    // testando se o número digitado é negativo é negativo
    if(nEsimo < 0){
        System.out.println("Digite um número positivo! ");
    //chamando a função que irá retornar os resultados até o n-ésimo.
    }else{
        for (int i = 0; i <= nEsimo; i++){
            System.out.println(fibonacciN(i));
            
        }
    }
   
    sc.close(); // fim da entrada de dados
}

}// fim da classe fibonacci