// gerente é um funcionário / gerente herda da class funcionario
public class EditorVideo extends Funcionario {

    public EditorVideo(String nome, String cpf) {
        super(nome, cpf);
    }

    public double getBonificacao(){
        return 100;
    }
}
