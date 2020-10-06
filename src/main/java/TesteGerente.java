public class TesteGerente {

    public static void main(String[] args) {
        Gerente gerente = new Gerente("gerente", "07070412606");
         gerente.setSenha(123);
         boolean senha = gerente.autentica(123);
         gerente.setSalario(1000);
         System.out.print(gerente.getNome() + "\n" + gerente.getCpf() + "\n" +
                 senha + "\n" + gerente.getBonificacao());

    }
}
