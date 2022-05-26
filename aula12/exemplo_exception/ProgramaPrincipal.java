package exemplo_exception;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        // int num = ConsleUtils.LerInteiro("Digite um inteiro: ");
        // System.out.printf("Inteiro digitado %d", num);

        int num = ConsleUtils.LerInteiro("Digite um inteiro: ");
        long fat = Fatorial.calcular(num);
        if(fat==-1){
            System.out.printf("Não foi possível calcular.");
        }else{
            System.out.printf("\n%d = %d", num, fat);
        }
    }
}
