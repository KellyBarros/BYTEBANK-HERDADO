// gerente é um funcionário / gerente herda da class funcionario / gerante assina contrato com autenticável, é um autencável
public class Gerente extends Funcionario implements Autenticavel {
    
    private AutenticacaoUtil autenticador;

    public Gerente(String nome, String cpf) {
        super(nome, cpf);
    }

    public Gerente() {
        this.autenticador = new AutenticacaoUtil();
    }

    public double getBonificacao(){
        return super.getSalario();
    }

    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

}
