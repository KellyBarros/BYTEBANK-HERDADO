public class TesteFuncionario {

    public static void main(String[] args) {
        Funcionario funcionario = new Gerente("kelly", "07070412606" );
        funcionario.setSalario(20000);
        System.out.println(funcionario.getBonificacao());
    }
}
