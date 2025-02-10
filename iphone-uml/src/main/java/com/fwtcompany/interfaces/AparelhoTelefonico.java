package com.fwtcompany.interfaces;

/**
 * Interface que define as operações básicas de um aparelho telefônico.
 */
public interface AparelhoTelefonico {

    /**
     * Realiza uma chamada para o número informado.
     *
     * @param numero Número de telefone para o qual a chamada será feita.
     */
    void ligar(String numero);

    /**
     * Atende uma chamada recebida.
     */
    void atender();

    /**
     * Inicia o correio de voz.
     */
    void iniciarCorreioVoz();
}
