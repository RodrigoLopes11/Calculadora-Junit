package Calculadora;

/**
 * Classe de teste para a classe Divisao.
 */
public class TesteDivisao {
    public static void main(String[] args) {
        
        // Introdução à calculadora
        System.out.println("Bem-vindo à sua Calculadora Virtual!");

        // Criação do objeto da classe Divisao
        Divisao divisao = new Divisao();
        
        // Teste 1: Divisão de 21 por 7
        int div = divisao.div(21, 7);
        System.out.println("A Divisão dos números é igual a " + div);

        // Teste 2: Divisão de 100 por 10
        int div2 = divisao.div(100, 10);
        System.out.println("A Divisão dos números é igual a " + div2);

        // Teste 3: Divisão de 169 por 13
        int div3 = divisao.div(169, 13);
        System.out.println("A Divisão dos números é igual a " + div3);
    }
}
