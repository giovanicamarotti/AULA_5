package siga;

public abstract class CriadorPainel {
    public abstract Painel criarPainel();

    public Painel montar() {
        Painel painel = criaPainel();
        painel.montar();
        return painel;
    }
}