import java.util.Scanner;

public class AreaRetangulo {
    /*Escreva um código que receba a base e a altura de um retângulo, 
    calcule sua área e exiba na tela fórmula: área=base X altura */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**** CALCULANDO A ÁREA DE UM RETANGULO ****");
        System.out.println("Informe o tamanho da base de um retangulo");
        var base = scanner.nextInt();
        System.out.println("Informe o tamanho da altura de um retangulo");
        var altura = scanner.nextInt();
        var  areaRetangulo = base * altura;
        System.out.println("A área do retangulo é " + areaRetangulo);
    }

}
