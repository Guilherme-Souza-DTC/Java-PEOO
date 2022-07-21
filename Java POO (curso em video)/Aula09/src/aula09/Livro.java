package aula09;

public class Livro implements Publicacao{
    //ATRIBUTOS
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    //METODOS ESPECIAIS
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.setLeitor(leitor);
        this.setPagAtual(0);
        this.setAberto(false);
    }
    //METODOS
    public void detalhes(){
        System.out.println("====== D E T A L H E S ======");
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de páginas: " + this.getTotPaginas());
        System.out.println("Página atual: " + this.getPagAtual());
        System.out.println("Está aberto? " + this.isAberto());
        System.out.println("Quem está lendo? " + this.leitor.getNome());
    }
    
    private String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private String getAutor() {
        return autor;
    }

    private void setAutor(String autor) {
        this.autor = autor;
    }

    private int getTotPaginas() {
        return totPaginas;
    }

    private void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    private int getPagAtual() {
        return pagAtual;
    }

    private void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    private boolean isAberto() {
        return aberto;
    }

    private void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    private Pessoa getLeitor() {
        return leitor;
    }

    private void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        if(this.aberto == true){
            System.out.println("O livro já está aberto.");
        } else {
            this.setAberto(true);
            System.out.println("O livro abriu.");
        }
    }

    @Override
    public void fechar() {
        if(this.aberto == false){
            System.out.println("O livro já está fechado.");
        } else {
            this.setAberto(false);
            System.out.println("O livro fechou.");
        }
    }

    @Override
    public void folhear() {
        this.setPagAtual(this.getPagAtual() + 5);
        if(this.getPagAtual() >= this.getTotPaginas()){
            this.setPagAtual(this.getTotPaginas());
            System.out.println("Você já está na última página.");
        }
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual() + 1);
        if(this.getPagAtual() >= this.getTotPaginas()){
            this.setPagAtual(this.getTotPaginas());
            System.out.println("Você já está na última página.");
        }
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual() - 1);
        if(this.getPagAtual() < 0){
            this.setPagAtual(0);
            System.out.println("Você já está no inicio do livro.");
        }
    }
}
