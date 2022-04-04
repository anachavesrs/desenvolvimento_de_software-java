import java.util.Scanner;

public class Fatorial {

    // atributos
    // funções e procedimentos
    //função principal
    public static void main(String[] args) {
        System.out.println("Bem vindo ao programa fatorial feito em Java!");
        Scanner sc = new Scanner(System.in); //importando entrada de dados entrada de dados
        int numero; 
        long fatorial = 1;     

        // validando se o int é positivo usando o sc.hasNextInt()
        do {
            System.out.println("Digite o número que deseja calcular, OBS* o número deve ser positivo:");
            while (!sc.hasNextInt()) {
                System.out.println("isso não é um número!");
                sc.next();
            }
            numero = sc.nextInt();
        }while (numero <=0);
        System.out.println("O resultado do fatorial segue abaixo:");

        // calculando o fatorial
        for(int i = 1; i <= numero; i++){
            fatorial = fatorial * i;
        }
        // retornando o resultado da operaçao
        System.out.println(fatorial);
        sc.close(); // fim da entrada de dados
        
     }
}