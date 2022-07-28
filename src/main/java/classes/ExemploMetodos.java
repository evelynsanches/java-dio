package classes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExemploMetodos {
    public static void main(String[] args) {
        Carro carro = new Carro("volks", "gol", 2001, "g5");
        Carro pessoa = new Carro("volks", "gol", 2001, "g5");

        System.out.println(carro.getModelo());
        System.out.println(pessoa.adicionarPessoas());
        System.out.println(pessoa.removerPessoas());

        Gerente gerente = new Gerente();
        gerente.setValorImposto(1000);
        System.out.println(gerente.calculaImposto());

        Supervisor supervisor = new Supervisor();
        supervisor.setValorImposto(800);
        System.out.println(supervisor.calculaImposto());

        Atendente atendente = new Atendente();
        atendente.setValorImposto(500);
        System.out.println(atendente.calculaImposto());

        Date dataNascimento = new Date(861678000000L);
        Date dataExercicio = new Date(1273892400000L);
        boolean antes = dataNascimento.before(dataExercicio);
        boolean depois = dataNascimento.after(dataExercicio);
        System.out.println(antes);
        System.out.println(depois);

        Calendar dataVencimento = Calendar.getInstance();
        dataVencimento.add(Calendar.DATE, 10);
        System.out.println("Data vencimento é: " + dataVencimento.getTime());



    }
}
