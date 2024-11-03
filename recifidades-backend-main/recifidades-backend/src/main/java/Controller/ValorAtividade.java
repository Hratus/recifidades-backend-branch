package Controller;

import model.Atividades;

import java.rmi.server.UnicastRemoteObject;

public class ValorAtividade extends Atividades {

    public   ValorAtividade(String nomeAtividade, int valorAtividade, String descricaoAtividade) {
        super(nomeAtividade, valorAtividade, descricaoAtividade);

        Atividades[]atividades = new Atividades[5];
        atividades[0] = new Atividades("Visita ao Marco Zero", 50, "Passeio aos arredores da praça do marco zero, contemplando as esculturas e comercio local");
        atividades[1] = new Atividades("Excurção no Instituto Ricardo Brennand", 30, "Passeio no museu historico");
        atividades[2] = new Atividades("Um dia na Jaqueira", 20, "Passear no parque da jaqueira e aproveitar o dia ");
        atividades[3] = new Atividades("A praia mais massa do Nordeste", 100, "Tomar um banho nas aguas da praia de boa viagem" );


    }




}
