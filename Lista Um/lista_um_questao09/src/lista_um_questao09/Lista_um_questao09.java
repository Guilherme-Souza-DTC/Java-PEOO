package lista_um_questao09;

import java.util.Scanner;

public class Lista_um_questao09 {

    public static void main(String[] args) {
        double altura, peso;
        String sexo;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Qual sua altura? ");
        altura = ler.nextDouble();
        System.out.println("Qual seu sexo? [M/F]");
        sexo = ler.nextLine();
        
        if("M".equals(sexo)){
            peso = (72.7 * altura) - 58;
            System.out.println("Seu peso ideal é: " + peso);
        } else {
            peso = (62.1 * altura) - 44.7;
            System.out.println("Seu peso ideal é: " + peso);
        }
    }
    
}
