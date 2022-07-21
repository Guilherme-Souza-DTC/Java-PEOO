package exercicio_aula02;

public class Cinema {
    String filme;
    int valorIngresso;
    int meuDinheiro;
    float horario;
    String transporte;
    boolean irei;
    
    void status(){
        System.out.println("==================");
        System.out.println("Filme: " + this.filme);
        System.out.println("Preço do ingresso: " + this.valorIngresso);
        System.out.println("Meu dinheiro: " + this.meuDinheiro);
        System.out.println("Hórario: " + this.horario);
        System.out.println("Transporte: " + this.transporte);
        System.out.println("Irei? " + this.irei);
        System.out.println("==================");
    }
    
    void booIrei(){
        if(this.meuDinheiro >= this.valorIngresso){
            this.irei = true;
        } else {
            this.irei = false;
        }
    }
}
