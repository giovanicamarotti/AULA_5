package siga;

/*Gio: Nova classe criada unicamente para que montarPainel
não precise editar o código a cada painel criado*/

public class FabricaPainel {
    public static Painel criarPainel(String tipo) {
        Painel painel;


        if (tipo.equals("ALUNO")) {
            painel = new PainelAluno();
        } else if (tipo.equals("PROFESSOR")) {
            painel = new PainelProfessor();
        } else if (tipo.equals("COORDENADOR")) {
            painel = new PainelCoordenador();
        } else {
            throw new IllegalArgumentException("Perfil desconhecido: " + tipo);
        }
        return painel;
    }
}