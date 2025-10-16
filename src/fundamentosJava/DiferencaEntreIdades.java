package fundamentosJava;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DiferencaEntreIdades {
    /*Escreva um código que receba o nome e a idade de 2 pessoas e 
    imprima a diferença de idade entre elas */
    private static final String TITULO = "**** CALCULANDO A DIFERENCA ENTRE IDADES ****";

    public static void main(String[] args) {
        System.out.println(TITULO);
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Informe o nome da primeira pessoa: ");
            String primeiroNome = scanner.next();
            System.out.printf("Informe a idade de %s : ", primeiroNome);
            int primeiraIdade = scanner.nextInt();

            System.out.println("Informe o nome da segunda pessoa: ");
            String segundoNome = scanner.next();
            System.out.printf("Informe a idade de %s : ", segundoNome);
            int segundaIdade = scanner.nextInt();

            if (primeiraIdade < 0 || segundaIdade < 0) {
                System.out.println("Erro: A idade não pode ser um número negativo.");
            } else {
                int diferencaIdade = Math.abs(primeiraIdade - segundaIdade);
                System.out.printf("A diferença de idade entre %s e %s é de %d anos.\n", primeiroNome, segundoNome, diferencaIdade);
            }

        } catch (InputMismatchException e) {
            System.out.println("Erro: A idade deve ser um número inteiro válido.");
        }
    }
}
