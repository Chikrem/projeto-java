import java.util.Random;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        nSecreto();
    }

    public static void nSecreto() {

        try (Scanner scanner = new Scanner(System.in)) {
            
            int randomNumber = new Random().nextInt(100);
            int nAdivinhado = 0;

            System.out.println("Adivinhe o número secreto entre 0 e 100: ");
            System.out.println("Escolha um número:");

            for (int i = 0; i < 5; i++) {
                nAdivinhado = scanner.nextInt();
                if (nAdivinhado == randomNumber) {
                    System.out.println("Parabéns, o número era: " + randomNumber);
                    break;
                } else if (nAdivinhado < randomNumber) {
                    System.out.println("O número " + nAdivinhado + " é menor que o número secreto!");
                } else if (nAdivinhado > randomNumber) {
                    System.out.println("O número " + nAdivinhado + " é maior que o número secreto!");
                } else {
                    System.out.println("Número inválido!");
                }
            }
            System.out.println("O número secreto era: " + randomNumber);
        }

    }
}
