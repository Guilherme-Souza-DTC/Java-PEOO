package scanner.ler.pkgdo.teclado;
import java.util.Scanner; // Modo de importar o scanner (que serve para o usuario digitar o valor de uma variavel pelo teclado
public class ScannerLerDoTeclado {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); // Declaração do objeto Scanner que serve para ler do teclado
        System.out.println("Digite um número: ");
        int N1 = ler.nextInt(); // Modo de leitura de uma variavel usando o objeto Scanner
        System.out.println("O número digitado foi: " + N1);
        System.out.println("Digite seu nome: ");
        ler.nextLine(); // limpeza de buffer
        String nome = ler.nextLine(); // Ler nomes caraceteres
        System.out.println("Seu nome é: " + nome);
    }
}