package aula09;

public class Aula09 {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[3];
        
        p[0] = new Pessoa ("Guilherme", 18, "Masculino");
        Livro livro = new Livro("As aventuras de Sherlock Holmes", "Arthur C. Doyle", 432, p[0]);
        livro.abrir();
        livro.folhear();
        livro.detalhes();
    }
    
}
