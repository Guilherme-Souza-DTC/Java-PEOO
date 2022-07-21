package lista_um_questao11;

import java.util.Scanner;

public class Lista_um_questao11 {

    public static void main(String[] args) {
        double preco, pagamento;
        int codigo;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Qual o preço do produto? ");
        preco = ler.nextDouble();
        System.out.println("Qual a forma de pagamento?");
        System.out.println("[1] A vista em dinheiro com 10% de desconto");
        System.out.println("[2] A vista no cartão de crédito com 15% de desconto");
        System.out.println("[3] Em duas vezes sem juros");
        System.out.println("[4] Em duas vezes com juros de 10%");
        codigo = ler.nextInt();
        
        if(codigo == 1){
            pagamento = preco * 0.90;
            System.out.println("O total a pagar foi: " + pagamento);
        } else if(codigo == 2){
            pagamento = preco * 0.85;
            System.out.println("O total a pagar foi: " + pagamento);
        } else if(codigo == 3){
            pagamento = preco/2;
            System.out.println("O total a pagar foi: " + pagamento + " duas vezes.");
        } else {
            pagamento = (preco/2) * 1.10;
            System.out.println("O total a pagar foi: " + pagamento + " duas vezes.");
        }
        
    }
}
