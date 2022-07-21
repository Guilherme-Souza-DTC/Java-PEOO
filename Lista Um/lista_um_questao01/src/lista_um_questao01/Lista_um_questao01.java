package lista_um_questao01;

import java.util.Scanner;

public class Lista_um_questao01 {

    public static void main(String[] args) {
        int a, b, c, soma;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        a = ler.nextInt();
        System.out.println("Digite o valor de B: ");
        b = ler.nextInt();
        System.out.println("Digite o valor de C: ");
        c = ler.nextInt();
        
        soma = a+b;
        
        if(soma > c){
            System.out.println("A soma de A + B é maior que o valor de C.");
        } else {
            System.out.println("A soma de A + B é menor que o valor de C.");
        }
    }
    
}
