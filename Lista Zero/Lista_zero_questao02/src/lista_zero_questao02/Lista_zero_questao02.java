package lista_zero_questao02;

import java.util.Scanner;

public class Lista_zero_questao02 {

    public static void main(String[] args) {
        int n1, n2, soma;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        n1 = ler.nextInt();
        System.out.print("Digite o segundo valor: ");
        n2 = ler.nextInt();
        
        soma = n1 + n2;
        
        System.out.println("A soma de " + n1 + " + " + n2 + " é igual a " + soma + ".");
    }
}
