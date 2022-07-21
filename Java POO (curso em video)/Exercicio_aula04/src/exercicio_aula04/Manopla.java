package exercicio_aula04;

public class Manopla {
    private String nome;
    private String cor;
    private boolean laser;
    
    public Manopla(String nome1, String cor1){
        this.nome = nome1;
        this.cor = cor1;
        this.laser = false;
    }
    
    public void status(){
        System.out.println("==============");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Laser ligado? " + this.laser);
        System.out.println("==============");
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome1){
        this.nome = nome1;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setCor(String cor1){
        this.cor = cor1;
    }
    
    public void ligarLaser(){
        this.laser = true;
    }
    
    public void desligarLaser(){
        this.laser = false;
    }
}
