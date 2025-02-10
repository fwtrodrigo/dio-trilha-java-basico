package com.fwtcompany.modelos;

import com.fwtcompany.interfaces.NavegadorInternet;

public class NavegadorInternetImpl implements NavegadorInternet {
    @Override
    public void exibirPagina(String url) {
        System.out.println("Pagina internet: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar Pagina");
    }
}
