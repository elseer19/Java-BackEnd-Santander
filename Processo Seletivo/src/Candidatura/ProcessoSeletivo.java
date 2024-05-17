package Candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"Pedro", "Tiago", "João", "Maria", "Judas",};
        for(String candidato : candidatos){
            entrandoEmContato(candidato);}

    }

    static void entrandoEmContato(String candidato){
        System.out.println("Entrando em contato com o candidato: " + candidato);
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando ){
                tentativasRealizadas++;
            } else System.out.println("Candidato atendeu a ligação");

        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu){
            System.out.println("Candidato " + candidato + " atendeu a ligação na " + tentativasRealizadas + " tentativa");
        } else {
            System.out.println("Candidato " + candidato + " não atendeu a ligação realizamos" + tentativasRealizadas + " tentativas");
        }

    }


    static boolean atender(){
        return new Random().nextInt(3)==1;}

    static void imprimirSelecionados(){
        String [] candidatos = {"Pedro", "Tiago", "João", "Maria", "Judas",};
        // for each //
        for (String candidato : candidatos) {
            System.out.println("Candidato Aprovado(a) é: " + candidato);
        }
    }

    static void seleçãoCandidato(){
        String [] candidatos = {"Pedro", "Tiago", "João", "Maria", "Judas", "Paulo", "Timotio", "Lucas", "Mateus", "Marcos"};
        
        int candidatoSelecionado = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatoSelecionado < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("Candidato: " + candidato + " Salario Pretendido: " + salarioPretendido);

            if (salarioBase >= salarioPretendido){
                candidatoSelecionado++;

                System.out.println("Candidato selecionado: " + candidato + " Foi selecionado para a vaga" );
            } 
            candidatoAtual++;
        }
    
    
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800.0, 2000.0);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato ");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar com contra proposta ");
        } else {
                System.out.println("Aguardando demais candidatos ");
        }

    }
}
