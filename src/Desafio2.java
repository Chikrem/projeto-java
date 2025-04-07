import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        // nPositivo();
        // nCompara();
        // nCalculaArea();
        // nTabuada();
        // nFatorial();
        nImparPar();
    }

    public static void nPositivo() {
        System.out.println("Digite um número inteiro:");
        try (Scanner scanner = new Scanner(System.in)) {
            int numero = scanner.nextInt();
            if (numero > 0) {
                System.out.println("O número " + numero + " é positivo!");
            } else {
                System.out.println("O número " + numero + " é negativo!");
            }
        }
    }

    public static void nCompara() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número inteiro:");
            int numeroA = scanner.nextInt();
            System.out.println("Digite o segundo número inteiro:");
            int numeroB = scanner.nextInt();
            if (numeroA == numeroB) {
                System.out.println("Os números " + numeroA + " e " + numeroB + " são iguais!");
            } else {
                System.out.println("Os números " + numeroA + " e " + numeroB + " são diferentes!");
            }
        }
    }

    public static void nCalculaArea() {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Digite 1 para calcular a área do quadrado e 2 para calcular a área do círculo:");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:

                    System.out.println("Digite o comprimento dos lados:");
                    int numeroA = scanner.nextInt();

                    int area = numeroA * numeroA;

                    System.out.println("A área do quadrado é: " + area);
                    break;

                case 2:
                    System.out.println("Digite o raio:");
                    int raio = scanner.nextInt();

                    double areaCirculo = 3.14159265359 * Math.pow(raio, 2);

                    System.out.println("A área do círculo é: " + areaCirculo);
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }
    }

    public static void nTabuada() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite um número para exibir a sua tabuada: ");
            int numero = scanner.nextInt();
            System.out.println("Tabuada de: " + numero);
            for (int i = 1; i < 11; i++) {
                System.out.println(numero + "x" + i + "=" + (i * numero));
            }
        }
    }

    public static void nImparPar() {
        System.out.println("Digite um número inteiro:");
        try (Scanner scanner = new Scanner(System.in)) {
            int numero = scanner.nextInt();
            if (numero%2 == 0) {
                System.out.println("O número " + numero + " é par!");
            } else {
                System.out.println("O número " + numero + " é ímpar!");
            }
        }
    }

    public static void nFatorial() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite um número para calcular o fatorial: ");
            int numero = scanner.nextInt();
            System.out.println("Fatorial de: " + numero);

            int fact = 1;
            if (numero < 0) {
                System.out.println("Número inválido!");
            } else if (numero == 0) {
                System.out.println("Fatorial de 0 é 1!");
            } else if (numero == 1) {
                System.out.println("Fatorial de 1 é 1!");
            } else {
                for (int i = 1; i <= numero; i++) {
                    fact = fact * i;
                }
                System.out.println("Fatorial de " + numero + " é: " + fact);
            }
        }
    }

}
