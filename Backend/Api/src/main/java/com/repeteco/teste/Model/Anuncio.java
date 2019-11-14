package com.repeteco.teste.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "anuncio")
public class Anuncio {

    @Id
    @GeneratedValue
    private int idAnuncio;
    private String titulo;
    private String descricao;
    private Date dtInicial;
    private Date dtFinal;
    private String valor;
    private String escola;
    private String tamanho;
    private String conservacao;
    private Byte[] imagem;
    private String type;


    public Anuncio() {}

    public Anuncio(String titulo, String descricao, Date dtInicial, Date dtFinal, String valor, String escola,
                   String tamanho, String conservacao, Byte[] imagem, String type) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dtInicial = dtInicial;
        this.dtFinal = dtFinal;
        this.valor = valor;
        this.escola = escola;
        this.tamanho = tamanho;
        this.conservacao = conservacao;
        this.imagem = imagem;
        this.type = type;
    }

    public int getIdAnuncio() {
        return idAnuncio;
    }

    public void setIdAnuncio(int idAnuncio) {
        this.idAnuncio = idAnuncio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDtInicial() {
        return dtInicial;
    }

    public void setDtInicial(Date dtInicial) {
        this.dtInicial = dtInicial;
    }

    public Date getDtFinal() {
        return dtFinal;
    }

    public void setDtFinal(Date dtFinal) {
        this.dtFinal = dtFinal;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getConservacao() {
        return conservacao;
    }

    public void setConservacao(String conservacao) {
        this.conservacao = conservacao;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Byte[] getImagem() {
        return imagem;
    }

    public void setImagem(Byte[] imagem) {
        this.imagem = imagem;
    }

    @Override
    public String toString() {
        return "Anuncio{" +
                "idAnuncio=" + idAnuncio +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dtInicial=" + dtInicial +
                ", dtFinal=" + dtFinal +
                ", valor='" + valor + '\'' +
                ", escola='" + escola + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", conservacao='" + conservacao + '\'' +
                ", imagem='" + imagem + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
