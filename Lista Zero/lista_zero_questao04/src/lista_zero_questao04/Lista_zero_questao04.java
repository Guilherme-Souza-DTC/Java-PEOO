package lista_zero_questao04;

import java.util.Scanner;

public class Lista_zero_questao04 {

    public static void main(String[] args) {
        double nota1, nota2, nota3, nota4, media;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        nota1 = ler.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = ler.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = ler.nextDouble();
        System.out.print("Digite a quarta nota: ");
        nota4 = ler.nextDouble();
        
        media = (nota1+nota2+nota3+nota4)/4;
        
        System.out.println("Sua media é igual a " + media + ".");
    }
    
}