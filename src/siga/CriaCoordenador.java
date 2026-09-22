package siga;

public class CriaCoordenador extends CriadorPainel {
    @Override
    public Painel criarPainel() {
        return new PainelCoordenador();
    }
}