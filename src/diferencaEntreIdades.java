import java.util.Scanner;

public class diferencaEntreIdades {
    /*Escreva um código que receba o nome e a idade de 2 pessoas e 
    imprima a diferença de idade entre elas */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**** CALCULANDO A DIFERENCA ENTRE IDADES **** ");
        System.out.println("Informe o nome da primeira pessoa: ");
        var name = scanner.next();
        System.out.printf("Informe a idade de %s : ", name);
        var age = scanner.nextInt();
        System.out.println("Informe o nome da segunda pessoa: ");
        var name2 = scanner.next();
        System.out.printf("Informe a idade de %s : ", name2);
        var age2 = scanner.nextInt();
        var diferencaEntreIdades = 0; 
        if (age > age2) {
            diferencaEntreIdades = age - age2;
        }else{
            diferencaEntreIdades = age2 - age;
        }
        
        System.out.printf("a diferença de idade entre %s e %s é de %d anos", name, name2, diferencaEntreIdades);
    }
}
