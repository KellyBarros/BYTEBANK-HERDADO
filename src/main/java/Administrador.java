public class Administrador extends Funcionario implements Autenticavel{

   private AutenticacaoUtil autenticador;

   public Administrador(String nome, String cpf) {
        super(nome, cpf);
    }

   public Administrador() {
       this.autenticador = new AutenticacaoUtil();
    }
    public double getBonificacao() {
        return 300;
    }

    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}
