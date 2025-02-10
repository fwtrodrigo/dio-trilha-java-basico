package com.fwtcompany.modelos;

import com.fwtcompany.interfaces.AparelhoTelefonico;
import com.fwtcompany.interfaces.NavegadorInternet;
import com.fwtcompany.interfaces.ReprodutorMusical;

public class Iphone extends Smartphone{
    public Iphone(ReprodutorMusical reprodutorMusical, AparelhoTelefonico aparelhoTelefonico, NavegadorInternet navegadorInternet) {
        super(reprodutorMusical, aparelhoTelefonico, navegadorInternet);
    }
}
