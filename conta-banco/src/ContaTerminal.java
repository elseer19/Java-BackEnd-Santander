// Importando a classe Scanner para leitura de dados
import java.util.Scanner;

// Classe ContaTerminal
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Instanciando a classe Scanner
        Scanner entrada = new Scanner(System.in);
        
        // Mensagem Introdutória
        System.out.println("Olá, Seja Bem-vindo ao Banco DIO! Vamos criar sua conta? ");

        // Mensagem de Aceite do Cliente
        System.out.println("Digite 1 - Para Sim \nDigite 2 - Para Não:");
        int aceiteCliente = entrada.nextInt();

        if (aceiteCliente == 1) {
            System.out.println("Vamos pedir para que digite algumas informações.");
            System.out.println("Após digitar as informações tecle ENTER e vamos confirmar os dados digitados no final.");
            
            // Declarando e Coletando os dados do Cliente
            System.out.println("Digite seu nome: ");
            String nome = entrada.next();

            // Para facilitar a leitura do código foi pedido as informações sem o digito, deixando o cliente ciente.
            System.out.println("Digite sua Agencia sem o digito: ");
            int agencia = entrada.nextInt();

            System.out.println("Digite sua Conta sem o digito: ");
            int numeroConta = entrada.nextInt();

            System.out.println("Digite o valor do seu saldo: ");
            double saldo = entrada.nextDouble();

            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo é de R$ %.2f já está disponível para saque", nome, agencia, numeroConta, saldo);

            entrada.close();

        } else if (aceiteCliente == 2){
            System.out.println("Obrigado por acessar o Banco DIO! Até a próxima!");
            System.exit(0);
        } else {
            System.out.println("Opção Inválida! Tente novamente.");
            System.exit(0);
        }    
}
}
