package positivo.ou.negativo;

import java.util.Scanner;

public class PositivoOuNegativo {

    public static void main(String[] args) {
        int n1;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite algum valor: ");
        n1 = ler.nextInt();
        
        if (n1 > 0){
            System.out.println("POSITIVO");
        } else if (n1 == 0) {
            System.out.println("É igual a zero, numero NULO.");
        } else {
            System.out.println("NEGATIVO");
        }
    }
    
}
