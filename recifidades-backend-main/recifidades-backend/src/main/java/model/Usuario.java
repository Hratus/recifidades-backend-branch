package model;

import java.util.LinkedList;

public class Usuario {
    private Long idUsuario;

    private String nomeUsuario;

    private String emailUsuario;

    private String senhaUsuario;
    ///Os Pontos podem ser trocados por MoedasCapibas
    private int pontosAcumulados;

    private int saldoMoedasCapibas;

    private String cpf;

    private String cnpj;

    ///Fazer primeiro Pontos Turisticos
    private LinkedList<PontoTuristico> locaisVisitados;

    /// Getters and seters dos objetos privados da Classe Usuario///
    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public int getPontosAcumulados() {
        return pontosAcumulados;
    }

    public void setPontosAcumulados(int pontosAcumulados) {
        this.pontosAcumulados = pontosAcumulados;
    }

    public int getSaldoMoedasCapibas() {
        return saldoMoedasCapibas;
    }

    public void setSaldoMoedasCapibas(int saldoMoedasCapibas) {
        this.saldoMoedasCapibas = saldoMoedasCapibas;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

   // public LinkedList<PontoTuristico> getLocaisVisitados() {
       // return locaisVisitados;
  //  }

 //   public void setLocaisVisitados(LinkedList<PontoTuristico> locaisVisitados) {
 //       this.locaisVisitados = locaisVisitados;
 //   }



    ///Talvez um polimorfismo para separar Empresa de Usuario/turista
    ///
    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nomeUsuario='" + nomeUsuario + '\'' +
                ", emailUsuario='" + emailUsuario + '\'' +
                ", senhaUsuario='" + senhaUsuario + '\'' +
                ", pontosAcumulados=" + pontosAcumulados +
                ", saldoMoedasCapibas=" + saldoMoedasCapibas +
                ", cpf='" + cpf + '\'' +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }
}
