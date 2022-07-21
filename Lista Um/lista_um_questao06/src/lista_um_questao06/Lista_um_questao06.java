package lista_um_questao06;

import java.util.Scanner;

public class Lista_um_questao06 {

    public static void main(String[] args) {
        boolean n1, n2;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("O primeiro: [true/false]");
        n1 = ler.nextBoolean();
        System.out.println("O segundo: [true/false]");
        n2 = ler.nextBoolean();
        
        if(n1 && n2){
            System.out.println("Os dois valores são verdadeiros.");
        } else if(n1 == false && n2 == false){
            System.out.println("Os dois valores são falsos.");
        } else {
            System.out.println("Os dois tem valores diferentes.");
        }
    }
    
}