package lista_um_questao08;

import java.util.Scanner;

public class Lista_um_questao08 {

    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite três valores diferentes: ");
        n1 = ler.nextInt();
        n2 = ler.nextInt();
        n3 = ler.nextInt();
        
        if(n1>n2 && n1>n3){
            System.out.println("Maior: " + n1);
            if(n2 > n3){
                System.out.println("Meio: " + n2);
                System.out.println("Menor: " + n3);
            } else {
                System.out.println("Meio: " + n3);
                System.out.println("Menor: " + n2);
            }
        } else if(n2 > n1 && n2 > n3){
            System.out.println("Maior: " + n2);
            if(n1 > n3){
                System.out.println("Meio: " + n1);
                System.out.println("Menor: " + n3);
            } else {
                System.out.println("Meio: " + n3);
                System.out.println("Menor: " + n1);
            }
        } else if(n3 > n1 && n3 > n2){
            System.out.println("Maior: " + n3);
            if(n1 > n2){
                System.out.println("Meio: " + n1);
                System.out.println("Menor: " + n2);
            } else {
                System.out.println("Meio: " + n2);
                System.out.println("Menor: " + n1);
            }
        }
    }
    
}