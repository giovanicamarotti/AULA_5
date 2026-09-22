package siga;

public class PainelZelador implements Painel {

@Override
    public void montar() {
        System.out.println("=== Painel do Zelador ===");
        System.out.println("- Ordem de Serviço");
        System.out.println("- Movimentação de Materiais");
        System.out.println("- Requisição de Manutenção");
    }
}