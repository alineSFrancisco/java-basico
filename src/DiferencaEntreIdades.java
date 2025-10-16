import java.util.Scanner;

public class DiferencaEntreIdades {
    /*Escreva um código que receba o nome e a idade de 2 pessoas e 
    imprima a diferença de idade entre elas */
    private static final String TITULO = "**** CALCULANDO A DIFERENCA ENTRE IDADES ****";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(TITULO);
        System.out.println("Informe o nome da primeira pessoa: ");
        var primeiroNome = scanner.next();
        System.out.printf("Informe a idade de %s : ", primeiroNome);
        var primeiraIdade = scanner.nextInt();

        System.out.println("Informe o nome da segunda pessoa: ");
        var segundoNome = scanner.next();
        System.out.printf("Informe a idade de %s : ", segundoNome);
        var segundaIdade = scanner.nextInt();

        int diferencaIdade = Math.abs(primeiraIdade - segundaIdade);
        
        System.out.printf("a diferença de idade entre %s e %s é de %d anos \n", primeiroNome, segundoNome, diferencaIdade);
    }
}
