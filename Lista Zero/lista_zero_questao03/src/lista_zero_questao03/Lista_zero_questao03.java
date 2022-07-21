package lista_zero_questao03;

import java.util.Scanner;

public class Lista_zero_questao03 {

    public static void main(String[] args) {
        int n1, anual;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu salario mensal: ");
        n1 = ler.nextInt();
        anual = n1 * 12;
        System.out.println("Voce recebe " + anual + " de salario por ano.");
    }
    
}