import java.util.Scanner;

public class AreaRetangulo {
    /*Escreva um código que receba a base e a altura de um retângulo, 
     * calcule sua área e exiba na tela fórmula: área=base X altura
     */
    private static final String TITULO = "**** CALCULANDO A ÁREA DE UM RETANGULO ****";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(TITULO);
        try {
            System.out.println("Informe o tamanho da base de um retangulo");
            int base = scanner.nextInt();
            System.out.println("Informe o tamanho da altura de um retangulo");
            int altura = scanner.nextInt();
            if (base <= 0 || altura <= 0) {
                System.out.println("A base e a altura devem ser maiores que zero.");
            } else {
                int areaRetangulo = base * altura;
                System.out.println("A área do retangulo é " + areaRetangulo);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
        }
    }

}
