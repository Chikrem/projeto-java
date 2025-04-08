import java.util.Scanner;

public class Loops {
    public static void loopFor() {
        try (
            Scanner leitura = new Scanner(System.in)) {
            double mediaAvaliacao = 0;
            double nota = 0;

            for (int i = 0; i < 3; i++) {
                System.out.println("Diga sua avaliação para o filme:  ");
                nota = leitura.nextDouble();
                mediaAvaliacao += nota;
            }

            System.out.println("Média de avaliações " + mediaAvaliacao / 3);
        }
    }

    public static void loopWhile() {

        try (Scanner leitura = new Scanner(System.in)) {
            double mediaAvaliacao = 0;
            double nota = 0;
            int totalDeNotas = 0;

            while (nota != -1) {
                System.out.println("Diga sua avaliação para o filme ou -1 para encerrar ");
                nota = leitura.nextDouble();
                if (nota != -1 && nota >= 0 && nota <= 10) {
                    mediaAvaliacao += nota;
                    totalDeNotas++;
                } else break;
            }

            System.out.println("Média de avaliações " + mediaAvaliacao / totalDeNotas);
        }
    }
}
