package exercicio.de.fixação.pkg1;
import java.util.Scanner;
public class ExercicioDeFixação1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = ler.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();
        System.out.println("Digite seu sexo: [m/f] ");
        char sexo = ler.next().charAt(0);
        double salario = Math.pow(idade, 3);
        System.out.println("Seu nome é " + nome + ". Sua idade é " + idade + ". Seu sexo é " + sexo + ". E seu salario é R$" + salario);
        
    }
    
}
