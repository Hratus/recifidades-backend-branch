package model;
///classe recente,
public class Atividades {

    private Long idAtividade;

    private String nomeAtividade;

    private int valorAtividade;

    private String descricaoAtividade;


    public Atividades(String nomeAtividade, int valorAtividade, String descricaoAtividade) {
        this.nomeAtividade = nomeAtividade;
        this.valorAtividade = valorAtividade;
        this.descricaoAtividade = descricaoAtividade;
    }

    public Long getIdAtividade() {
        return idAtividade;
    }



    public String getNomeAtividade() {
        return nomeAtividade;
    }



    public int getValorAtividade() {
        return valorAtividade;
    }


    public String getDescricaoAtividade() {
        return descricaoAtividade;
    }


}
