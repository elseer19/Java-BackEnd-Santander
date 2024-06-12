import Aparelho.Iphone;

public class App {
    public static void main(String[] args) {
       
        Iphone iphone1 = new Iphone();

        iphone1.ligar("123456789");
        iphone1.atender();
        iphone1.iniciarChamadaVoz();
        iphone1.exibirPagina("www.google.com");
        iphone1.abrirNovaAba();
        iphone1.atualizarPagina();
        iphone1.selecionarMusica("Musica 1");
        iphone1.tocar();
        iphone1.pausar();
        
    }
}
