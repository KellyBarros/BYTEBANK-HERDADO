// gerente é um funcionário / gerente herda da class funcionario
public class Designer extends Funcionario {

    public Designer(String nome, String cpf) {
        super(nome, cpf);
    }

    public double getBonificacao(){
        return 200;
    }
}
