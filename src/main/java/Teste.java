public class Teste {

    public static void main(String[] args) {
        FuncionarioTeste func = new FuncionarioTeste("kelly", 07070412606);
        func.setSalario(1000);
        func.setTipo(0);
        System.out.println(func.getBonificacao());
    }
}
