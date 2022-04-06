import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    //Atributos
    //Funções e proced

    //Função principal
    public static void main(String[] args) {
        System.out.println("Jogo de adivinhação feito em Java!");
        Random gerador = new Random();
        int numSorteado = gerador.nextInt(100) + 1; // armazenando o n sorteado em uma var "numSorteado"
        int vidas = 10; // var quantidade de vidas inicial
        int palpite = 0;
        Scanner sc = new Scanner(System.in); // habilitando entrada de dados

        // rodar o programa enquanto há vidas.
        while (vidas > 0) {
            System.out.println("Digite um número entre 1 e 100");
            palpite = sc.nextInt();
            // validando se o palpite do jogador é um número válido
            if (palpite < 0 || palpite > 100) {
                System.out.println("Numero inválido");
                break;
            // caso positivo, executar o programa
            }else{
                if (palpite > numSorteado) {
                    vidas --;
                    System.out.println("O número escolhido é MAIOR que o número sorteado!");
                    System.out.println("Vocêa ainda possui  " + vidas + " vidas");
                } else if (palpite < numSorteado){
                    vidas --;
                    System.out.println("O número escolhido é MENOR que o número sorteado!");
                    System.out.println("Vocêa ainda possui  " + vidas + " vidas");
                }  else if (palpite == numSorteado){
                    System.out.println("Parabéns!! Voce acertou!!");
                    System.out.println("O número escolhido por voê foi: " + palpite + "e o número sorteado foi: " + numSorteado);
                    break;
                }          
            }
        }
        // caso as vidas tenham zerado
         if (vidas == 0) {
             System.out.println("Voce perdeu! Suas vidas acabaram");
         }

        sc.close(); // fim da entrada de dados

    }
}// fim da classe
