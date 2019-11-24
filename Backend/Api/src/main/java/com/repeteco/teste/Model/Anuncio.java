package com.repeteco.teste.Model;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Calendar;
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
    private String tamanho;
    private String conservacao;
    private Byte[] imagem1;
    private Byte[] imagem2;
    private Byte[] imagem3;
    private Byte[] imagem4;
    private Byte[] imagem5;
    private String type;

    private static final int PRAZOEXPIRACAO = 30;

    @Column(name = "id_client")
    private int idClient;


    @Column(name = "id_escola")
    private int idEscola;


    public Anuncio() {}

    public Anuncio(String titulo, String descricao, String valor, String tamanho, String conservacao, Byte[] imagem1,
                   Byte[] imagem2, Byte[] imagem3, Byte[] imagem4, Byte[] imagem5, String type) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dtInicial = Calendar.getInstance().getTime();
        this.dtFinal = Calendar.getInstance().getTime();
        this.valor = valor;
        this.tamanho = tamanho;
        this.conservacao = conservacao;
        this.imagem1 = imagem1;
        this.imagem2 = imagem2;
        this.imagem3 = imagem3;
        this.imagem4 = imagem4;
        this.imagem5 = imagem5;
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

    public Byte[] getImagem1() {
        return imagem1;
    }

    public void setImagem1(Byte[] imagem1) {
        this.imagem1 = imagem1;
    }

    public Byte[] getImagem2() {
        return imagem2;
    }

    public void setImagem2(Byte[] imagem2) {
        this.imagem2 = imagem2;
    }

    public Byte[] getImagem3() {
        return imagem3;
    }

    public void setImagem3(Byte[] imagem3) {
        this.imagem3 = imagem3;
    }

    public Byte[] getImagem4() {
        return imagem4;
    }

    public void setImagem4(Byte[] imagem4) {
        this.imagem4 = imagem4;
    }

    public Byte[] getImagem5() {
        return imagem5;
    }

    public void setImagem5(Byte[] imagem5) {
        this.imagem5 = imagem5;
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
                ", tamanho='" + tamanho + '\'' +
                ", conservacao='" + conservacao + '\'' +
                ", imagem1=" + Arrays.toString(imagem1) +
                ", imagem2=" + Arrays.toString(imagem2) +
                ", imagem3=" + Arrays.toString(imagem3) +
                ", imagem4=" + Arrays.toString(imagem4) +
                ", imagem5=" + Arrays.toString(imagem5) +
                ", type='" + type + '\'' +
                ", idClient=" + idClient +
                ", idEscola=" + idEscola +
                '}';
    }
}
