package Aparelho;

import Internet.*;
import Musica.*;
import Telefone.*;

public class Iphone implements Safari, Ipod, LGPhone {
    
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url + " no Iphone");
    }

    public void abrirNovaAba() {
        System.out.println("Abrindo nova aba no Iphone");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página no Iphone");
    }


    public void tocar() {
        System.out.println("Tocando música: no Iphone");
    }

    public void pausar() {
        System.out.println("Música pausada no Iphone");
    } 

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica + " no Iphone");
    }

    public void ligar(String numero) {
        System.out.println("Ligando telefone " + numero + " no Iphone");
    }

    public void atender() {
        System.out.println("Atendendo telefone no Iphone");
    }

    public void iniciarChamadaVoz() {
        System.out.println("Iniciando chamada de voz no Iphone");
    }
}
