package exercicio.de.fixação.pkg2;
import java.util.Scanner;
public class ExercicioDeFixação2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        int nota1 = ler.nextInt();
        System.out.println("Digite a segunda nota: ");
        int nota2 = ler.nextInt();
        double media = (nota1 + nota2)/2;
        if (media>=7){
            System.out.println("APROVADO!! Sua média é: " + media);
        } else {
            if((media>=5) & (media<7)){
                System.out.println("Recuperação... Sua média é: " + media);
        } else {
                System.out.println("Reprovado... Sua média é: " + media);
            }
        }
    }
}
