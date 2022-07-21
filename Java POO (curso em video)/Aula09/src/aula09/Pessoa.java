package aula09;

public class Pessoa {
    //ATRIBUTOS
    private String nome;
    private int idade;
    private String sexo;
    //METODOS ESPECIAIS
    public Pessoa(String no, int id, String sex){
        this.setNome(no);
        this.setIdade(id);
        this.setSexo(sex);
    }
    //METODOS
    public void fazerAniver(){
        this.setIdade(this.getIdade() + 1);
    }
    
    protected String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    private String getSexo() {
        return sexo;
    }

    private void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
