package com.fwtcompany.interfaces;

/**
 * Interface que define as operações básicas de um reprodutor musical.
 */
public interface ReprodutorMusical {

    /**
     * Inicia a reprodução da música.
     */
    void tocar();

    /**
     * Pausa a música em reprodução.
     */
    void pausar();

    /**
     * Seleciona uma música para reprodução.
     *
     * @param musica Nome da música a ser reproduzida.
     */
    void selecionarMusica(String musica);
}
