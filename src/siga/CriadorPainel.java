package siga;

//Gio: Classe Abstrata que dita o método concreto de cada perfil
//Junto destes foram criados CriaAluno, CriaProfessor e CriaCoordenador
//Cada um implementa o método adequado.
public abstract class CriadorPainel {
    public abstract Painel criarPainel();

    public Painel montar() {
        Painel painel = criarPainel();
        painel.montar();
        return painel;
    }
}