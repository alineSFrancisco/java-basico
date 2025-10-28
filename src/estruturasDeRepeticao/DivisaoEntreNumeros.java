package estruturasDeRepeticao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoEntreNumeros {

    /*Escreva um código onde o usuário informa um número inicial, 
    posteriormente irá informar outros N números, 
    a execução do código irá continuar até que o número informado
    dividido pelo primeiro número tenha resto diferente de 0 na divisão, 
    números menores que o primeiro número devem ser ignorados */
    private static final String TITULO = "**** DIVISÃO COM RESTO DIFERENTE DE ZERO ****";

    public static void main(String[] args) {
        System.out.println(TITULO);
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Informe o número inicial: ");
            int numeroInicial = scanner.nextInt();
            System.out.println("\nAgora, informe outros números. A execução continuará até que um número dividido pelo inicial tenha resto diferente de zero.");
            //System.out.println("Números menores que o número inicial serão ignorados.");
            while (true) {
                System.out.print("Informe um número: ");
                int numeroAtual = scanner.nextInt();
                if (numeroAtual % numeroInicial == 0) {
                    System.out.printf("O número %d dividido por %d tem resto 0. Continue informando números.\n", numeroAtual, numeroInicial);
                } else {
                    System.out.printf("O número %d dividido por %d tem resto %d (diferente de zero). Encerrando o programa.\n", numeroAtual, numeroInicial, numeroAtual % numeroInicial);
                    break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
        }
    }
}
