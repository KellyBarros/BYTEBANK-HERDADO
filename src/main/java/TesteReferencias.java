public class TesteReferencias {

    public static void main(String[] args) {
        Gerente g1 = new Gerente("Kelly", "07070412606");
        g1.setSalario(1000);
        EditorVideo editor = new EditorVideo("KellyAllan", "07070412604");
        editor.setSalario(1000);
        Designer des = new Designer("KellyAllan2", "07070412603");
        editor.setSalario(1000);

        ControleBonificacao controlBonific = new ControleBonificacao();
        controlBonific.registra(g1);
        controlBonific.registra(editor);
        controlBonific.registra(des);

        System.out.print(controlBonific.getSoma());

    }
}
