package Internet;

public class NavegadorInternet implements Safari{
    
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void abrirNovaAba() {
        System.out.println("Abrindo nova aba");
    }  

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
}
