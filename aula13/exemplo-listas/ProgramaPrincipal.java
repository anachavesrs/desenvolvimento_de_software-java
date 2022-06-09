import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        // Instanciar um list de pessoa

        List<Pessoa> pessoas = new ArrayList<Pessoa>();


        // add obj na lista

        pessoas.add(new Pessoa("João", 25, 78, 1));
        pessoas.add(new Pessoa("Pedro", 40, 120, 1.86));
        pessoas.add(new Pessoa("Francieli", 33, 65, 1.63));
        pessoas.add(new Pessoa("Diogo", 15, 54, 1.62));
        pessoas.add(new Pessoa("Natasha", 23, 53, 1.85));

        //foreach + print
        for(Pessoa p : pessoas){
            System.out.println(p);
        }

        //Ordenação

        System.out.println("\n-------------------ORDENAÇAO---------------------------\n");

        Collections.sort(pessoas);

        //foreach + print

        for(Pessoa p : pessoas){
            System.out.println(p);
        }

        //Criar nova pessoa

        Pessoa p = new Pessoa("Gustavo", 38, 80.5, 1.76);
        p.getTelefones().put("Residencial", "41 3624-3273");
        p.getTelefones().put("Comercial", "41 3663-4455");
        p.getTelefones().put("celular", "41 98861-3030");

        System.out.printf("Telefone celular : %s", p.getTelefones().get("celular"));
    }
}
