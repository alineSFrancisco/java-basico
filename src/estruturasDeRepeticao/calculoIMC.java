package estruturasDeRepeticao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculoIMC {

    /*Escreva um código onde o usuário entra com sua altura e peso, 
      seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e 
      seja exibida a mensagem de acordo com o resultado:
        Se for menor ou igual a 18,5 "Abaixo do peso";
        se for entre 18,6 e 24,9 "Peso ideal";
        Se for entre 25,0 e 29,9 "Levemente acima do peso";
        Se for entre 30,0 e 34,9 "Obesidade Grau I";
        Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
        Se for maior ou igual a 40,0 "Obesidade III (Mórbida)"; */
    private static final String TITULO = "**** CÁLCULO DO IMC ****";

    public static void main(String[] args) {
        System.out.println(TITULO);
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Informe sua altura em metros: ");
            double altura = scanner.nextDouble();
            System.out.print("Informe seu peso em quilogramas: ");
            double peso = scanner.nextDouble();

            // Se a altura for maior que 3, assume que foi digitada em centímetros e converte para metros.
            if (altura > 3) {
                altura = altura / 100;
            }
            
            if (altura <= 0 || peso <= 0) {
                System.out.println("Erro: Altura e peso devem ser valores positivos.");
            } else {
                double imc = peso / (altura * altura);
                System.out.printf("Seu IMC é: %.2f\n", imc);
    
                if (imc <= 18.5) {
                    System.out.println("Classificação: Abaixo do peso");
                } else if (imc <= 24.9) {
                    System.out.println("Classificação: Peso ideal");
                } else if (imc <= 29.9) {
                    System.out.println("Classificação: Levemente acima do peso");
                } else if (imc <= 34.9) {
                    System.out.println("Classificação: Obesidade Grau I");
                } else if (imc <= 39.9) {
                    System.out.println("Classificação: Obesidade Grau II (Severa)");
                } else {
                    System.out.println("Classificação: Obesidade III (Mórbida)");
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira um número válido para altura e peso.");
        }
    }
}
