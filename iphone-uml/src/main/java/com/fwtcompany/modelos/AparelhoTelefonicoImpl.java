package com.fwtcompany.modelos;

import com.fwtcompany.interfaces.AparelhoTelefonico;

public class AparelhoTelefonicoImpl implements AparelhoTelefonico {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atender");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio Voz");
    }
}
