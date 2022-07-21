package lista_zero_questao06;

import java.util.Scanner;

public class Lista_zero_questao06 {

    public static void main(String[] args) {
        double cm, m;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Me diga um valor em centimetros: ");
        cm = ler.nextDouble();
        m = cm / 1000;
        
        System.out.println(cm + "cm em metros é igual a: " + m + " metro(s).");
    }
    
}