package lista_um_questao10;

import java.util.Scanner;

public class Lista_um_questao10 {

    public static void main(String[] args) {
        double altura, peso, imc;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite sua altura: ");
        altura = ler.nextDouble();
        System.out.println("Digite seu peso: ");
        peso = ler.nextDouble();
        
        imc = peso/(altura * altura);
        
        if(imc < 18.5){
            System.out.println("Abaixo do peso.");
        } else if(imc >= 18.5 && imc < 25){
            System.out.println("Peso normal.");
        } else if(imc >= 25 && imc < 30){
            System.out.println("Acima do peso.");
        } else {
            System.out.println("Obeso.");
        }
    }
    
}
