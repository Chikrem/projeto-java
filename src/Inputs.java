import java.util.Scanner;

public class Inputs {
    public static void entradaTeclado() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();
            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();
            System.out.print("Digite seu peso: ");
            double peso = scanner.nextDouble();
            System.out.print("Digite seu sexo (M/F): ");
            char sexo = scanner.next().charAt(0);
            System.out.print("Digite sua altura: ");
            float altura = scanner.nextFloat();
            
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Peso: " + peso);
            System.out.println("Sexo: " + sexo);
            System.out.println("Altura: " + altura);
        }
    }
}
