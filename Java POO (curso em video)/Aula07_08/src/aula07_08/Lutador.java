package aula07_08;

public class Lutador {
    // ATRIBUTOS
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;
    
    // METODO CONSTRUTOR
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);
    }
    
    // METODOS
    private void setNome(String no){
        this.nome = no;
    }
    
    protected String getNome(){
        return this.nome;
    }
    
    private void setNacionalidade(String na){
        this.nacionalidade = na;
    }
    
    private String getNacionalidade(){
        return this.nacionalidade;
    }
    
    public void setIdade(int id){
        this.idade = id;
    }
    
    private int getIdade(){
        return this.idade;
    }
    
    private void setAltura(float al){
        this.altura = al;
    }
    
    private float getAltura(){
        return this.altura;
    }
    
    private void setPeso(float pe){
        this.peso = pe;
        this.setCategoria();
    }
    
    private float getPeso(){
        return this.peso;
    }
    
    private void setCategoria(){
        if(peso < 52.2){
            this.categoria = "Inválido";
        } else if(peso <= 70.3){
            this.categoria = "Leve";
        } else if(peso <= 83.9){
            this.categoria = "Médio";
        } else if(peso <= 120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }
    
    protected String getCategoria(){
        return this.categoria;
    }
    
    private void setVitorias(int vi){
        this.vitorias = vi;
    }
    
    private int getVitorias(){
        return this.vitorias;
    }
    
    private void setDerrotas(int de){
        this.derrotas = de;
    }
    
    private int getDerrotas(){
        return this.derrotas;
    }
    
    private void setEmpates(int em){
        this.empates = em;
    }
    
    private int getEmpate(){
        return this.empates;
    }
    
    // Metodos que deveriam ser da interface
    public void apresentar(){
        System.out.println("===== A P R E S E N T A N D O =====");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " anos");
        System.out.println(this.getAltura() + " m de altura");
        System.out.println("Pesando " + this.getPeso() + "kg");
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpate());
    }
    
    public void status(){
        System.out.println(this.getNome());
        System.out.println("é um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpate() + " empates");
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpate() + 1);
    }
}
