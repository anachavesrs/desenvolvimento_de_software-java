package exemplo_exception;

public class Fatorial {
    public static long calcular(int num) throws IllegalArgumentException {
        if(num >= 0){

            long fat = 1;
            for(int i = 1; i <= num; i++){
                        fat = fat * i;
                }
                return fat;

        }else{
            throw new IllegalArgumentException("Não existe fatorial de número negativo.");
        }
    }
}


