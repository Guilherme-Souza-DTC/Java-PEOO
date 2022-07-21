package execiciodefixação3;
import java.util.Scanner;
public class ExecicioDeFixação3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int N1 = ler.nextInt();
        System.out.println("Digite o segundo valor: ");
        int N2 = ler.nextInt();
        System.out.println("Digite o ultimo valor: ");
        int N3 = ler.nextInt();
        if ((N1<=N2) & (N1<=3) & (N2<=3)){
            System.out.println("Ordem crescente: " + N1 + " " + N2 + " " + N3);
        } else {
            if ((N2<=N1) & (N2<=N3) & (N1<=N3)){
            System.out.println("Ordem crescente: " + N2 + " " + N1 + " " + N3);
            } else {
                if ((N3<=N1) & (N3<=N2) & (N2<=N1)){
                    System.out.println("Ordem crescente: " + N3 + " " + N2 + " " + N1);
                } else {
                    if ((N1<=N2) & (N1<=N3) & (N3<=N2)){
                        System.out.println("Ordem crescente: " + N1 + " " + N3 + " " + N2);
                    } else {
                        if ((N2<=N1) & (N2<=N3) &(N3<=N1)){
                            System.out.println("Ordem crescente: " + N2 + " " + N3 + " " + N1);
                        } else {
                            System.out.println("Ordem crescente: " + N3 + " " + N1 + " " + N2);
                        }
                    }
                }
            }
        }
    }
    
}
