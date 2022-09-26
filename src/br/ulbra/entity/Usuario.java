/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.entity;

/**
 *
 * @author Leon
 */
public class Usuario {

    private int idUsu;
    private String nomeUsu;
    private String emailUsu;
    private String senhaUsu;
    private String foneUsu;
    private int sexoUsu;
    private String cepUsu;
    private String logradouroUsu;
    private String numUsu;
    private String bairroUsu;
    private String cidadeUsu;
    private String estadoUsu;

    public Usuario() {
    }

    public Usuario(int idUsu, String nomeUsu, String emailUsu, String senhaUsu, String foneUsu, int sexoUsu, String cepUsu, String logradouroUsu, String numUsu, String bairroUsu, String cidadeUsu, String estadoUsu) {
        this.idUsu = idUsu;
        this.nomeUsu = nomeUsu;
        this.emailUsu = emailUsu;
        this.senhaUsu = senhaUsu;
        this.foneUsu = foneUsu;
        this.sexoUsu = sexoUsu;
        this.cepUsu = cepUsu;
        this.logradouroUsu = logradouroUsu;
        this.numUsu = numUsu;
        this.bairroUsu = bairroUsu;
        this.cidadeUsu = cidadeUsu;
        this.estadoUsu = estadoUsu;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsu=" + idUsu + ", nomeUsu=" + nomeUsu + ", emailUsu=" + emailUsu + ", senhaUsu=" + senhaUsu + ", foneUsu=" + foneUsu + ", sexoUsu=" + sexoUsu + ", cepUsu=" + cepUsu + ", logradouroUsu=" + logradouroUsu + ", numUsu=" + numUsu + ", bairroUsu=" + bairroUsu + ", cidadeUsu=" + cidadeUsu + ", estadoUsu=" + estadoUsu + '}';
    }

   
    

    public int getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(int idUsu) {
        this.idUsu = idUsu;
    }

    public String getNomeUsu() {
        return nomeUsu;
    }

    public void setNomeUsu(String nomeUsu) {
        this.nomeUsu = nomeUsu;
    }

    public String getEmailUsu() {
        return emailUsu;
    }

    public void setEmailUsu(String emailUsu) {
        this.emailUsu = emailUsu;
    }

    public String getSenhaUsu() {
        return senhaUsu;
    }

    public void setSenhaUsu(String senhaUsu) {
        this.senhaUsu = senhaUsu;
    }

    public String getFoneUsu() {
        return foneUsu;
    }

    public void setFoneUsu(String foneUsu) {
        this.foneUsu = foneUsu;
    }

    public int getSexoUsu() {
        return sexoUsu;
    }

    public void setSexoUsu(int sexoUsu) {
        this.sexoUsu = sexoUsu;
    }

    public String getCepUsu() {
        return cepUsu;
    }

    public void setCepUsu(String cepUsu) {
        this.cepUsu = cepUsu;
    }

    public String getLogradouroUsu() {
        return logradouroUsu;
    }

    public void setLogradouroUsu(String logradouroUsu) {
        this.logradouroUsu = logradouroUsu;
    }

    public String getNumUsu() {
        return numUsu;
    }

    public void setNumUsu(String numUsu) {
        this.numUsu = numUsu;
    }

    public String getBairroUsu() {
        return bairroUsu;
    }

    public void setBairroUsu(String bairroUsu) {
        this.bairroUsu = bairroUsu;
    }

    public String getCidadeUsu() {
        return cidadeUsu;
    }

    public void setCidadeUsu(String cidadeUsu) {
        this.cidadeUsu = cidadeUsu;
    }

    public String getEstadoUsu() {
        return estadoUsu;
    }

    public void setEstadoUsu(String estadoUsu) {
        this.estadoUsu = estadoUsu;
    }
  
   
    

}
