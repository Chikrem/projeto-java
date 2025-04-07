public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        int anoDeLancamento = 2022;
        
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    
        // Chamada de métodos
        operadores();
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

}