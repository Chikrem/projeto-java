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

} 