package lista_zero_questao05;

import java.util.Scanner;

public class Lista_zero_questao05 {

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
        
        media = ((nota1 * 2) + (nota2 * 2) + (nota3 * 3) + (nota4 * 3))/10;
        
        System.out.println("Sua media ponderada é igual a " + media + ".");
    }
    
}