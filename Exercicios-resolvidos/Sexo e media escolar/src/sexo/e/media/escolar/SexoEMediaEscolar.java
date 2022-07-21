package sexo.e.media.escolar;

import java.util.Scanner;

public class SexoEMediaEscolar {

    public static void main(String[] args) {
        char sexo;
        int nota1, nota2, nota3;
        float media;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        nota1 = ler.nextInt();
        System.out.println("Digite a segunda nota: ");
        nota2 = ler.nextInt();
        System.out.println("Digite a terceira e ultima nota: ");
        nota3 = ler.nextInt();
        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Qual seu sexo? [m/f]");
        sexo = ler.next().charAt(0);
        
        if (sexo == 'm'){
            System.out.println("");
        }
    }
    
}
