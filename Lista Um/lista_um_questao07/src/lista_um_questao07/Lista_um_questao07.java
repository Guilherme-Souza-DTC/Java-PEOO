package lista_um_questao07;

import java.util.Scanner;

public class Lista_um_questao07 {

    public static void main(String[] args) {
        double n1, resto, resultado;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite algum valor: ");
        n1 = ler.nextInt();
        resto = n1%2;
        
        if(resto == 0){
            resultado = n1 + 5;
        } else {
            resultado = n1 + 8;
        }
        
        System.out.println("Resultado: " + resultado);
    }
    
}