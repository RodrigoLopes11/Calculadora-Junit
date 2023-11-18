package Calculadora;

/**
 * Classe de teste para a classe Subtracao.
 */
public class TesteSubtracao {
    public static void main(String[] args) {
        
        // Introdução à calculadora
        System.out.println("Bem-vindo à sua Calculadora Virtual!");

        // Criação do objeto da classe Subtracao
        Subtracao subtracao = new Subtracao();

        // Teste 1: Subtração de 15 por 8
        int subt = subtracao.sub(15, 8);
        System.out.println("A subtração dos números é igual a " + subt);

        // Teste 2: Subtração de -10 por 19
        int subt2 = subtracao.sub(-10, 19);
        System.out.println("A subtração dos números é igual a " + subt2);

        // Teste 3: Subtração de 8 por 11
        int subt3 = subtracao.sub(8, 11);
        System.out.println("A subtração dos números é igual a " + subt3);
    }
}
