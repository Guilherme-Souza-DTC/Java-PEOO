package lista_um_questao04;

import java.util.Scanner;

public class Lista_um_questao04 {

    public static void main(String[] args) {
        int a, b, c;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        a = ler.nextInt();
        System.out.println("Digite o valor de B: ");
        b = ler.nextInt();
        
        if(a == b){
            c = a + b;
        } else {
            c = a * b;
        }
        
        System.out.println("O valor de C é igual a: " + c);
    }
    
}