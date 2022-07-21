package lista_um_questao05;

import java.util.Scanner;

public class Lista_um_questao05 {

    public static void main(String[] args) {
        int n1, resposta;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um valor: ");
        n1 = ler.nextInt();
        
        if(n1 >= 0){
            resposta = n1*2;
        } else {
            resposta = n1*3;
        }
        
        System.out.println("O resultado deu: " + resposta);
    }
    
}