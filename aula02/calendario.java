import java.util.Scanner;

public class calendario {
    //função principal

    public static void main(String[]args){
        // mostrar uma mensagem para o usuário 
        System.out.println("Digite o mês:");
        Scanner input = new Scanner(System.in);

        // Ler um número digitado no teclado
        int mes = input.nextInt();

        // mostrar o nome do mês
        //      usando if
        //      usando switch
        System.out.println("Número digitado = " + mes);
        input.close();
    }
    
}
