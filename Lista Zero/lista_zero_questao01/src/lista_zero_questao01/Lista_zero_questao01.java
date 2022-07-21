package lista_zero_questao01;

import java.util.Scanner;

public class Lista_zero_questao01 {

    public static void main(String[] args) {
        int n1, n2;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        n1 = ler.nextInt();
        n2 = n1 * 2;
        System.out.println("O dobro de " + n1 + " é igual a: " + n2);
    }
    
}
