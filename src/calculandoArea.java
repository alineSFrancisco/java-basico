
import java.util.Scanner;

public class calculandoArea {

    /* Escreva um código que receba o tamanho do lado de um quadrado, 
    calcule sua área e exiba na tela fórmula: área=lado X lado */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**** CALCULANDO A ÁREA DE UM QUADRADO ****");
        System.out.println("Informe o tamanho do lado de um quadrado");
        var lado = scanner.nextInt();
        var  areaQuadrado = lado * lado;
        System.out.println("A área do quadrado é " + areaQuadrado);
    }
}
