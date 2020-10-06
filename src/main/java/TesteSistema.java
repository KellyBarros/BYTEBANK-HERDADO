public class TesteSistema {

    public static void main(String[] args) {
        Gerente g = new Gerente("Kelly", "07070412606");
        Administrador a = new Administrador("Kelly2", "07070412605");
        Cliente cliente = new Cliente();

        SistemaInterno sis = new SistemaInterno();
        g.setSenha(2121);
        a.setSenha(2122);
        cliente.setSenha(2121);
        sis.autentica(g);
        sis.autentica(a);
        sis.autentica(cliente);
    }
}
