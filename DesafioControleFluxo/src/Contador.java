import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        int parametroUm = lerInteiroValido(terminal, "Digite o primeiro parâmetro:");
        int parametroDois = lerInteiroValido(terminal, "Digite o segundo parâmetro:");

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        } finally {
            terminal.close();
        }
    }

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if ( parametroUm >= parametroDois ) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        } else {
            int contagem = parametroDois - parametroUm;

            for (int i = 1 ; i <= contagem; i++){
                System.out.println("Contador " + i);}}
            
        }

    static int lerInteiroValido(Scanner scanner, String mensagem) {
        int numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.println(mensagem);
                numero = scanner.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next(); // Limpa o buffer do scanner
            }
        }

        return numero;

	}
}