package lista_um_questao03;

import java.util.Scanner;

public class Lista_um_questao03 {

    public static void main(String[] args) {
        int n1, result;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite algum valor: ");
        n1 = ler.nextInt();
        result = n1%2;
        
        if(result == 1){
            System.out.println("O número " + n1 + " é impar.");
        } else {
            System.out.println("O número " + n1 + " é par.");
        }
    }
    
}