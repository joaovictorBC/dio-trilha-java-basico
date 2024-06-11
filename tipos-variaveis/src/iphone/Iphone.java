package iphone;

import iphone.Funcionalidades;
import iphone.aparelhosbase.AparelhoMusical;
import iphone.aparelhosbase.AparelhoTelefonico;
import iphone.internet.MetodoInternet;

public class Iphone {
    public static void main(String[] args) {
        Funcionalidades recursos = new Funcionalidades();
        
        AparelhoMusical musical = recursos;
        AparelhoTelefonico telefone = recursos;
        MetodoInternet internet = recursos;

        musical.tocar();
        telefone.atender();
        internet.adicionarAba();

    }
}