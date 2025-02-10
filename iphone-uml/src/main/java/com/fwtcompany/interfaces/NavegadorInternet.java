package com.fwtcompany.interfaces;

/**
 * Interface que define as operações básicas de um navegador de internet.
 */
public interface NavegadorInternet {

    /**
     * Exibe a página correspondente à URL informada.
     *
     * @param url Endereço da página a ser exibida.
     */
    void exibirPagina(String url);

    /**
     * Adiciona uma nova aba no navegador.
     */
    void adicionarNovaAba();

    /**
     * Atualiza a página atual do navegador.
     */
    void atualizarPagina();
}
