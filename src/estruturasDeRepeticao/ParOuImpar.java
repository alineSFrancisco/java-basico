package estruturasDeRepeticao;

import java.util.InputMismatchException;
import java.util.Scanner;


/* Escreva um código que o usuário entre com um primeiro número, 
um segundo número maior que o primeiro e escolhe entre a opção par e impar, 
com isso o código deve informar todos os números pares ou ímpares 
(de acordo com a seleção inicial) no intervalo de números informados, 
incluindo os números informados e em ordem decrescente; */
public class ParOuImpar {

    private static final String TITULO = "**** PAR OU IMPAR ****";

    public static void main(String[] args) {
        System.out.println(TITULO);
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Informe o primeiro número: ");
            int primeiroNumero = scanner.nextInt();
            System.out.println("Informe o segundo número maior que o primeiro: ");
            int segundoNumero = scanner.nextInt();
            if (primeiroNumero >= segundoNumero) {
                System.out.println("O segundo número deve ser maior que o primeiro.");
                return;
            }
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Números pares");
            System.out.println("2 - Números ímpares");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1: // Pares
                case 2: // Ímpares
                    System.out.println("Números no intervalo em ordem decrescente:");
                    // Para opção 1 (par), o resto esperado é 0. Para opção 2 (ímpar), é 1.
                    int restoEsperado = (opcao == 1) ? 0 : 1;
                    for (int i = segundoNumero; i >= primeiroNumero; i--) {
                        if (Math.abs(i % 2) == restoEsperado) {
                            System.out.println(i);
                        }
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha 1 para pares ou 2 para ímpares.");
                    // Não é necessário fazer mais nada, o programa terminará.
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
        }
    }
}
