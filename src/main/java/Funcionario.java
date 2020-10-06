// não pode criar objetos dessa classe porque ela é abstrata
public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;


    public Funcionario(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    protected Funcionario() {
    }

    //método não tem corpo, não há implementação
    public abstract double getBonificacao();

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
