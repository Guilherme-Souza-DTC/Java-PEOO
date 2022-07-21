package aula06;

public class ControleRemoto implements Controlador{
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    // Metodos
    public ControleRemoto(){
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }
    
    private int getVolume(){
        return this.volume;
    }
    
    private void setVolume(int volume1){
        this.volume = volume1;
    }
    
    private boolean getLigado(){
        return this.ligado;
    }
    
    private void setLigado(boolean ligado1){
        this.ligado = ligado1;
    }
    
    private boolean getTocando(){
        return this.tocando;
    }
    
    private void setTocando(boolean tocando1){
        this.tocando = tocando1;
    }
    
    // Metodos Abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("====== M E N U ======");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 0;i < this.getVolume(); i+=10){
            System.out.print("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado() == true){
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado() == false){
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if((this.getLigado() == true) && (this.getVolume() > 0)){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if((this.getLigado() == true) && (this.getVolume() == 0)){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if((this.getLigado() == true) && (this.getTocando() == false)){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if((this.getLigado() == true) && (this.getTocando() == true)){
            this.setTocando(false);
        }
    }
}
