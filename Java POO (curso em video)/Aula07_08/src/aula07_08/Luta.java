package aula07_08;

import java.util.Random;

public class Luta {
    // ATRIBUTOS
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //METODOS
    public void marcarLuta(Lutador l1,Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2)){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    
    public void lutar(){
        if(this.getAprovada() == true){
            System.out.println("==== D E S A F I A D O ====");
            this.getDesafiado().apresentar();
            System.out.println("=== D E S A F I A N T E ===");
            this.getDesafiante().apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("====== R E S U L T A D O ======");
            switch(vencedor){
                case 0: // Empate
                    System.out.println("Empate!!");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                case 1: // Ganhou desafiado
                    System.out.println("Vitória do " + this.desafiado.getNome() + "!!");
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
                case 2: // Ganhou desafiante
                    System.out.println("Vitória do " +this.desafiante.getNome());
                    this.getDesafiado().perderLuta();
                    this.getDesafiante().ganharLuta();
                    break;
            }
            System.out.println("===============================");
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }
    
    private void setDesafiado(Lutador dd){
        this.desafiado = dd;
    }
    
    private Lutador getDesafiado(){
        return this.desafiado;
    }
    
    private void setDesafiante(Lutador ds){
        this.desafiante = ds;
    }
    
    private Lutador getDesafiante(){
        return this.desafiante;
    }
    
    private void setRounds(int rd){
        this.rounds = rd;
    }
    
    private int getRounds(){
        return this.rounds;
    }
    
    private void setAprovada(boolean ap){
        this.aprovada = ap;
    }
    
    private boolean getAprovada(){
        return this.aprovada;
    }
}
