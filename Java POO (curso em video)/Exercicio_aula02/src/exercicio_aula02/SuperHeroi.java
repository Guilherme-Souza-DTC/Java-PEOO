package exercicio_aula02;

public class SuperHeroi {
    String NomeHeroi;
    String NomeReal;
    int idade;
    int altura;
    float peso;
    String poderes;
    String fraquesas;
    int lvlpoder;
    
    void status(){
        System.out.println("==========================");
        System.out.println("Nome de héroi: " + this.NomeHeroi);
        System.out.println("Nome real: " + this.NomeReal);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura (cm):" + this.altura);
        System.out.println("Peso (kg):" + this.peso);
        System.out.println("Poderes: " + this.poderes);
        System.out.println("Fraquesas: " + this.fraquesas);
        System.out.println("Nivel de poder: " + this.lvlpoder);
        System.out.println("==========================");
    }
    
    void contrato(){
        if(this.lvlpoder >= 45){
            System.out.println("Seu héroi pode se juntar a liga.");
        } else {
            System.out.println("Seu héroi precisa treinar mais.");
        }
    }
}
