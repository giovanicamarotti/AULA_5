package siga;

public class CriaAluno extends CriadorPainel {
    @Override
    public Painel criarPainel() {
        return new PainelAluno();
    }
}