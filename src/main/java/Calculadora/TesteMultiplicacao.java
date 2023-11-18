package Calculadora;

/**
 * Classe de teste para a classe Multiplicacao.
 */
public class TesteMultiplicacao {
    public static void main(String[] args) {
        
        // Introdução à calculadora
        System.out.println("Bem-vindo à sua Calculadora Virtual!");

        // Criação do objeto da classe Multiplicacao
        Multiplicacao multiplicacao = new Multiplicacao();

        // Teste 1: Multiplicação de 1 por 7
        int mult = multiplicacao.multi(1, 7);
        System.out.println("A multiplicação dos números é igual a " + mult);

        // Teste 2: Multiplicação de 45 por 3
        int mult2 = multiplicacao.multi(45, 3);
        System.out.println("A multiplicação dos números é igual a " + mult2);

        // Teste 3: Multiplicação de 12 por 5
        int mult3 = multiplicacao.multi(12, 5);
        System.out.println("A multiplicação dos números é igual a " + mult3);
    }
}
