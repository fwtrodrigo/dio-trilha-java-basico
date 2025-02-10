package com.fwtcompany;

import com.fwtcompany.interfaces.AparelhoTelefonico;
import com.fwtcompany.interfaces.NavegadorInternet;
import com.fwtcompany.modelos.*;

public class Main {
    public static void main(String[] args) {
        Smartphone iphone = new Iphone(new ReprodutorMusicalImpl(), new AparelhoTelefonicoImpl(), new NavegadorInternetImpl());

        System.out.println("----------------------------");
        System.out.println("Internet: ");
        iphone.adicionarNovaAba();
        iphone.exibirPagina("https://www.dio.me");
        iphone.atualizarPagina();

        System.out.println("----------------------------");
        System.out.println("Aparelho: ");
        iphone.ligar("190");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("----------------------------");
        System.out.println("Aparelho: ");
        iphone.selecionarMusica("TETA - Spankox - Michael Jackson Is Not Dead");
        iphone.tocar();
        iphone.pausar();
    }
}