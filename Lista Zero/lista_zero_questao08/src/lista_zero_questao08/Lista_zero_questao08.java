package lista_zero_questao08;

import java.util.Scanner;

public class Lista_zero_questao08 {

    public static void main(String[] args) {
        double c, f;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite os graus celsius: ");
        c = ler.nextDouble();
        f = c * 1.8 + 32;
        
        System.out.println(c + " Celsius em Fahrenheit é igual a:: " + f);
    }
    
}