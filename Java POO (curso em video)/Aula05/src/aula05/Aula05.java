package aula05;

public class Aula05 {

    public static void main(String[] args) {
        ContaBanco minha = new ContaBanco();
        minha.abrirConta("cp");
        minha.setNome("Guilherme Bernardo de Souza");
        minha.depositar(75f);
        minha.pagarMensal();
        minha.olharConta();
    }
    
}
