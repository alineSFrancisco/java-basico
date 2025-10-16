package fundamentosJava;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class App {
    /*Escreva um código que receba o nome e o ano de nascimento de alguém e 
    imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"*/
    public static void main(String[] args) throws Exception {
        var currentYear = OffsetDateTime.now().getYear();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o seu nome: ");
        var name = scanner.next();
        System.out.println("Informe o seu ano de nascimento: ");
        var year = scanner.nextInt();
        var age = currentYear - year;
        System.out.printf("Olá %s você tem %s anos \n", name, age);
    }
}
    