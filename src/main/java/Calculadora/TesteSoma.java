package Calculadora;

/**
 * Classe de teste para a classe Adicao.
 */
public class TesteSoma {
    public static void main(String[] args) {
        
        // Introdução à calculadora
        System.out.println("Bem-vindo à sua Calculadora Virtual!");

        // Criação do objeto da classe Adicao
        Adicao adicao = new Adicao();

        // Teste 1: Soma de 8 e 9
        int somar = adicao.soma(8, 9);
        System.out.println("A soma dos números é igual a " + somar);

        // Teste 2: Soma de 12 e 19
        int somar2 = adicao.soma(12, 19);
        System.out.println("A soma dos números é igual a " + somar2);

        // Teste 3: Soma de 10 e -9
        int somar3 = adicao.soma(10, -9);
        System.out.println("A soma dos números é igual a " + somar3);
    }
}
