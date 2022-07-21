package calculadora;
import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int N1 = ler.nextInt();
        ler.nextLine();
        System.out.println("Digite o segundo valor: ");
        int N2 = ler.nextInt();
        int Soma = N1 + N2;
        int Sub = N1 - N2;
        float Div = N1 / N2;
        int Mult = N1 * N2;
        System.out.println("A soma deles é: " + Soma + "\n A subtração deles é: " + Sub);
        System.out.println("A divisão de " + N1 + " Por " + N2 + " é igual a: " + Div);
        System.out.println("A multiplicação deles é: " + Mult);
    }
}
