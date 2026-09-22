package siga;

public class CriaZelador extends CriadorPainel {
    @Override
    public Painel criarPainel() {
        return new PainelZelador();
    }
}