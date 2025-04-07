public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        int anoDeLancamento = 2022;
        
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        
        String sinopse;
        
        sinopse = """
            Filme Top Gun
            Filme de aventura com galã dos anos 80
            Muito bom!
            Ano de Lançamento
            """ + anoDeLancamento;
            
        System.out.println(sinopse);

        // Chamada de métodos
        // operadores();
        // tiposDeDados();
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
        double decimal = (10.5 + 55.5 + 10.9)/2; // ponto flutuante
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

}