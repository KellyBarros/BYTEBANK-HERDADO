public class FuncionarioTeste {
    private String nome;
    private double cpf;
    private double salario;
    private int tipo = 0; // 0 - funcionario comum 1 - gerente 2 - diretor

    public FuncionarioTeste(String nome, double cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getTipo() {
        return this.tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Double getBonificacao(){
        if(this.tipo == 0){
            return this.salario += this.salario * 0.1;
        }
        return this.salario += this.salario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCpf() {
        return this.cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
