package exemplo_exception;

import java.util.Scanner;

public class ConsleUtils {
    public static int LerInteiro(String msg){
        System.out.println(msg);
        Scanner input = new Scanner(System.in);
        while(true) {
        String linhaDigitada = input.next();
        try{
            int num = Integer.parseInt(linhaDigitada);
            input.close();
            return num;

        } catch(NumberFormatException ex){
           
             System.out.println("Valor informado não é um número inteiro válido. Tente novamente.");
            // System.out.println(ex.getMessage());
            // ex.printStackTrace();
            }

        }
        
    }
}
