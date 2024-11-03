package model;

import java.util.LinkedList;

public class Morador extends Usuario{
    private Long idMorador;

    private Long nomeMorador;

    private String cepMorador;

    private Long levelMorador;


    private LinkedList<Atividades> atividadesSociais; //nao vai receber uma string, e sim uma lista??


}
