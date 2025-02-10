package com.fwtcompany.modelos;

import com.fwtcompany.interfaces.ReprodutorMusical;

public class ReprodutorMusicalImpl implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Tocar musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionar musica: " + musica);
    }
}
