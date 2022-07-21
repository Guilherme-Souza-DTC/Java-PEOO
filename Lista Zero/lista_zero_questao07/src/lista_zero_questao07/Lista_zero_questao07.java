package lista_zero_questao07;

import java.util.Scanner;

public class Lista_zero_questao07 {

    public static void main(String[] args) {
        double peso, altura, imc;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Qual seu peso? ");
        peso = ler.nextDouble();
        System.out.println("Qual sua altura? ");
        altura = ler.nextDouble();
        imc = peso/(altura*2);
        
        System.out.println("Seu imc é igual: " + imc);
    }
    
}