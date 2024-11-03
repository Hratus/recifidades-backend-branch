package model;

public class Turista extends Usuario {
    private Long  idTurista;

    // criar funçao/classe de pontosacumulados
    private int pontosAcumulados;

    // Construtores, Getters e Setters
    public Turista(String nome, String email) {

        this.setNomeUsuario(nome);
        this.setEmailUsuario(email);
        this.pontosAcumulados = 0;
    }



    public void adicionarPontos(int pontos) {
        this.pontosAcumulados += pontos;
    }
}
