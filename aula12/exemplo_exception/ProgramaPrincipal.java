package exemplo_exception;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        // int num = ConsleUtils.LerInteiro("Digite um inteiro: ");
        // System.out.printf("Inteiro digitado %d", num);

        int num = ConsleUtils.LerInteiro("Digite um inteiro: ");
       try{
        long fat = Fatorial.calcular(num);
        System.out.printf("%d! = %d", num, fat);
       } catch(IllegalArgumentException ex){
           System.out.println(ex.getMessage());
       }

    }
}
