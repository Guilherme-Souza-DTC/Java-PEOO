package multiplo.de.pkg3.ou.não;

import java.util.Scanner;

public class MultiploDe3OuNão {

    public static void main(String[] args) {
        int n1;
        int mult3;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite algum valor: ");
        n1 = ler.nextInt();
        mult3 = n1%3;
        
        if (mult3 == 0){
            System.out.println("É múltiplo de 3");
        } else {
            System.out.println("Não é múltiplo de 3");
        }
    }
    
}
