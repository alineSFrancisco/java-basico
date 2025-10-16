package fundamentosJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaQuadrado {

    /* Escreva um código que receba o tamanho do lado de um quadrado, 
     * calcule sua área e exiba na tela fórmula: área=lado X lado
     */
    private static final String TITULO = "**** CALCULANDO A ÁREA DE UM QUADRADO ****";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(TITULO);
        try {
            System.out.println("Informe o tamanho do lado de um quadrado");
            int lado = scanner.nextInt();
            if (lado <= 0) {
                System.out.println("O lado deve ser maior que zero.");
            } else {
                int areaQuadrado = lado * lado;
                System.out.println("A área do quadrado é " + areaQuadrado);
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
        }
    }
}
