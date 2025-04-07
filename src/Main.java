// Início Aula-3

public class Main {
    public static void main(String[] args) {

        // Chamada de métodos
        // textBlock();
        // operadores();
        // tiposDeDados();
        // comparaString("textoA", "textoB");
        // formataString();
        // conversao();

        // Chamada de métodos de Classe externas
        //Condicional.condicionaisJava();                
        // Condicional.switchCase("premium");     
        // Condicional.switchDia(7);;
        
        // Entrada de dados do teclado
        // Inputs.entradaTeclado();

        // Loops
        // Loops.loopFor();
        Loops.loopWhile();
    }

    public static void textBlock() {
        System.out.println("Hello, World!");

        int anoDeLancamento = 2022;

        System.out.println("Ano de Lançamento: " + anoDeLancamento);

        String sinopse; // TextBlock

        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de Lançamento
                """ + anoDeLancamento;

        System.out.println(sinopse);
    }

    public static void operadores() {
        int a = 10;
        int b = 20;

        // Operadores Aritméticos
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Módulo: " + (a % b));

        // Operadores Relacionais
        System.out.println("Igual: " + (a == b));
        System.out.println("Diferente: " + (a != b));
        System.out.println("Maior: " + (a > b));
        System.out.println("Menor: " + (a < b));
    }

    public static void tiposDeDados() {
        // Tipos primitivos
        int numero = 10; // inteiro
        double decimal = (10.5 + 55.5 + 10.9) / 2; // ponto flutuante
        char letra = 'A'; // caractere
        boolean verdadeiro = true; // booleano

        // Tipos não primitivos
        String texto = "Olá Mundo!"; // string

        // Exibindo os valores
        System.out.println("Número: " + numero);
        System.out.println("Decimal: " + decimal);
        System.out.println("Letra: " + letra);
        System.out.println("Verdadeiro: " + verdadeiro);
        System.out.println("Texto: " + texto);
    }

    public static void comparaString(String str1, String str2) {

        String senha = "12345";
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }

        if (str1.equals(str2)) {
            System.out.println("As strings são iguais.");
        } else {
            System.out.println("As strings são diferentes.");
        }

    }

    public static void formataString() {
        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        String mensagem = String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor);
        System.out.println(mensagem);
    }

    public static void conversao() {
        // Casting
        int numero = 9;
        double decimal = (double) numero/2; // conversão de int para double
        System.out.println("Número: " + numero);
        System.out.println("Decimal: " + decimal);

        // Conversão de String para int
        String strNumero = "123";
        int numeroConvertido = Integer.parseInt(strNumero);
        System.out.println("Número convertido: " + numeroConvertido);

        // Conversão de int para String
        int numeroInt = 456;
        String strConvertido = String.valueOf(numeroInt);
        System.out.println("String convertida: " + strConvertido);

        // Conversão de String para double
        String strDecimal = "123.45";
        double decimalConvertido = Double.parseDouble(strDecimal);
        System.out.println("Decimal convertido: " + decimalConvertido);
    }

}

