package aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo; // cc: conta corrente. cp: conta poupança
    private String nome;
    private float saldo;
    private boolean status;
    
    public ContaBanco(){
        this.setStatus(false);
        this.setSaldo(0);
    }
    
    public void olharConta(){
        if(this.status = true){
            System.out.println("=================");
            System.out.println("Número da conta: " + this.getNumConta());
            System.out.println("Tipo: " + this.getTipo());
            System.out.println("Dono: " + this.getNome());
            System.out.println("Saldo: " + this.getSaldo());
            System.out.println("=================");
        } else {
            System.out.println("Você precisa abrir uma conta.");
        }
    }
    
    public int getNumConta(){
        return this.numConta;
    }
    
    public void setNumConta(int num){
        this.numConta = num;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setTipo(String tipo1){
        this.tipo = tipo1;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome1){
        this.nome = nome1;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(float saldo1){
        this.saldo = saldo1;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    
    public void setStatus(boolean status1){
        this.status = status1;
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.status = true;
        if(this.tipo.equals("cc")){
            this.saldo = this.saldo + 50;
        } else {
            this.saldo = this.saldo + 150;
        }
    }
    
    public void fecharConta(){
        if(this.saldo > 0){
            System.out.println("Acesso negado! Precisa sacar tudo.");
        } else if (this.saldo < 0){
            System.out.println("Acesso negado! Você está em debito.");
        } else {
            this.status = false;
            System.out.println("Conta fechada com sucesso.");
        }
    }
    
    public void depositar(float dinheiro){
        if(this.status = true){
            this.saldo = this.saldo + dinheiro;
        } else {
            System.out.println("Sua conta está fechada.");
        }
    }
    
    public void sacar(float dinheiro){
        if((this.status = true) && ((this.saldo > 0) && (this.saldo > dinheiro))){
            this.saldo = this.saldo - dinheiro;
        } else if(this.status = false){
            System.out.println("Sua conta está fechada.");
        } else if(this.saldo <= 0){
            System.out.println("Você está sem dinheiro para sacar.");
        } else if(this.saldo < dinheiro){
            System.out.println("Seu saque é maior que a quantidade de dinheiro disponivel na conta.");
        }
    }
    
    public void pagarMensal(){
        if(this.tipo.equals("cc")){
            if(this.saldo >= 12){
                this.saldo = this.saldo - 12;
            } else {
                System.out.println("Dinheiro insuficiente para pagar.");
            }
        } else {
            if(this.saldo >= 20){
                this.saldo = this.saldo - 20;
            } else {
                System.out.println("Dinheiro insuficiente para pagar.");
            }
        }
    }
}
