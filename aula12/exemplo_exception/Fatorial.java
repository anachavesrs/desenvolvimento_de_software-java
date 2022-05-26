package exemplo_exception;

public class Fatorial {
    public static long calcular(int num) {
        if(num >= 0){

            long fat = 1;
            for(int i = 1; i <= num; i++){
                        fat = fat * i;
                }
                return fat;

        }else{
            System.out.printf("Não existe fatorial negativo: %d!", num);
            return -1;
        }
    }
}


