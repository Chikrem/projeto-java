public class Condicional {

    public static void condicionaisJava() {
        int idade = 18;
        boolean incluido = true;
        String tipoPlano = "premium";

        // Operador ternário
        String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado);

        // Bloco if-else
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        // Bloco if-else com operador lógico
        if (idade >= 18 && incluido) {
            System.out.println("Maior de idade e incluído");
        } else if (idade >= 18 && !incluido) {
            System.out.println("Maior de idade e não incluído");
        } else {
            System.out.println("Menor de idade e não incluído");
        }

        if (tipoPlano.equals("premium") || incluido) {
            System.out.println("Plano Premium");
        } else if (tipoPlano.equals("basic")) {
            System.out.println("Plano Básico");
        } else {
            System.out.println("Outro tipo de plano");
        }

    }

    public static void switchCase(String tipoPlano) {

        switch (tipoPlano) {
            case "premium":
                System.out.println("Plano Premium");
                break;
            case "basic":
                System.out.println("Plano Básico");
                break;
            default:
                System.out.println("Outro tipo de plano");
                break;
        }
    }

    public static void switchDia(int dia) {
        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "domingo";
                break;
            case 2:
                nomeDia = "segunda-feira";
                break;
            case 3:
                nomeDia = "terça-feira";
                break;
            case 4:
                nomeDia = "quarta-feira";
                break;
            case 5:
                nomeDia = "quinta-feira";
                break;
            case 6:
                nomeDia = "sexta-feira";
                break;
            case 7:
                nomeDia = "sábado";
                break;
            default:
                nomeDia = "Dia inválido";
                break;
        }

        System.out.println("O dia " + dia + " é " + nomeDia);
    }
}