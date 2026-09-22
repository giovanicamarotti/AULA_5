package siga;

public class CriaProfessor extends CriadorPainel {
    @Override
    public Painel criarPainel() {
        return new PainelProfessor();
    }
}