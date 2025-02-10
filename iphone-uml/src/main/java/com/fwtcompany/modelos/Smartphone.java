package com.fwtcompany.modelos;

import com.fwtcompany.interfaces.AparelhoTelefonico;
import com.fwtcompany.interfaces.NavegadorInternet;
import com.fwtcompany.interfaces.ReprodutorMusical;

public abstract class Smartphone {
    private final ReprodutorMusical reprodutorMusical;
    private final AparelhoTelefonico aparelhoTelefonico;
    private final NavegadorInternet navegadorInternet;

    public Smartphone(ReprodutorMusical reprodutorMusical, AparelhoTelefonico aparelhoTelefonico, NavegadorInternet navegadorInternet) {
        this.reprodutorMusical = reprodutorMusical;
        this.aparelhoTelefonico = aparelhoTelefonico;
        this.navegadorInternet = navegadorInternet;
    }

    public void tocar() {
        reprodutorMusical.tocar();
    }

    public void pausar() {
        reprodutorMusical.pausar();
    }

    public void selecionarMusica(String musica) {
        reprodutorMusical.selecionarMusica(musica);
    }

    // Métodos de AparelhoTelefonico
    public void ligar(String numero) {
        aparelhoTelefonico.ligar(numero);
    }

    public void atender() {
        aparelhoTelefonico.atender();
    }

    public void iniciarCorreioVoz() {
        aparelhoTelefonico.iniciarCorreioVoz();
    }

    // Métodos de NavegadorInternet
    public void exibirPagina(String url) {
        navegadorInternet.exibirPagina(url);
    }

    public void adicionarNovaAba() {
        navegadorInternet.adicionarNovaAba();
    }

    public void atualizarPagina() {
        navegadorInternet.atualizarPagina();
    }
}
