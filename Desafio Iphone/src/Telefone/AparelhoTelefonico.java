package Telefone;

public class AparelhoTelefonico implements LGPhone{
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada");
    }

    public void iniciarChamadaVoz() {
        System.out.println("Iniciando chamada de voz");
    }
}
