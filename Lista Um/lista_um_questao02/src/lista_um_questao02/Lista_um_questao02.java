package lista_um_questao02;

import java.util.Scanner;

public class Lista_um_questao02 {

    public static void main(String[] args) {
        String nome, sexo, estado_civil;
        int ano = 0;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        nome = ler.nextLine();
        System.out.println("Qual seu sexo? [M/F]");
        sexo = ler.nextLine();
        System.out.println("É casado(a)? [S/N]");
        estado_civil = ler.nextLine();
        if(("F".equals(sexo)) && ("S".equals(estado_civil))){
            System.out.println("Está casada a quantos anos? ");
            ano = ler.nextInt();
        }
        
        System.out.println("Seu nome: " + nome);
        System.out.println("Seu sexo: " + sexo);
        System.out.println("Seu estado civil: " + estado_civil);
        if (("F".equals(sexo)) && ("S".equals(estado_civil))) {
            System.out.println("Tempo que está casada: " + ano);
        }
    }
    
}