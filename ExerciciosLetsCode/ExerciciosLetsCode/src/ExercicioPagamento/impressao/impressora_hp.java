package ExercicioPagamento.impressao;

public class impressora_hp  implements Impressora{

    @Override
    public void imprimir(Imprimivel imprimivel) {
        System.out.println("**************************");
        System.out.println("Nota Fiscal - Loja do Povo");
        System.out.println(imprimivel.getCabecalhoNF());
        System.out.println(imprimivel.getCorpoNF());
        System.out.println("Impresso em HP");
    }

}
