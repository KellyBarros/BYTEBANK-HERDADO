public class SistemaInterno {
    private int senha = 2121;

    public void autentica(Autenticavel au) {
        boolean autenticou = au.autentica(this.senha);
        if (autenticou) {
            System.out.print("Autenticou");
        } else {
            System.out.print("Não autenticou");
        }
    }

}
