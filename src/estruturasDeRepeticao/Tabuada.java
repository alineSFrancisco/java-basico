package estruturasDeRepeticao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tabuada {
    /*Escreva um código onde o usuário entra com um número 
    e seja gerada a tabuada de 1 até 10 desse número*/
    private static final String TITULO = "**** TABUADA ****";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(TITULO);
        try {
            System.out.print("Informe um número: ");
            int numero = scanner.nextInt();
            System.out.println("Tabuada de " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d\n", numero, i, (numero * i));
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
        }
    }
}
