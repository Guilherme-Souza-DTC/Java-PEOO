package idade.votação.e.habilitação;

import java.util.Scanner;

public class IdadeVotaçãoEHabilitação {

    public static void main(String[] args) {
        int nascimento;
        int anoatual = 2020;
        int idade;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Qual ano você nasceu? ");
        nascimento = ler.nextInt();
        idade = anoatual - nascimento;
        System.out.println("Sua idade é: " + idade);
        
        if (idade >= 16) {
            System.out.println("Você pode votar.");
        } else {
            System.out.println("Você não pode votar nem tirar habilitação.");
        }
        
        if (idade >= 18) {
            System.out.println("Você pode tirar habilitação.");
        }
    }
    
}
