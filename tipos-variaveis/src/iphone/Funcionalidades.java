package iphone;

import iphone.aparelhosbase.AparelhoMusical;
import iphone.aparelhosbase.AparelhoTelefonico;
import iphone.internet.MetodoInternet;

public class Funcionalidades implements AparelhoMusical, AparelhoTelefonico, MetodoInternet {

    public void selecionarMusica() {
        System.out.println("Selecione a música");
    }

    public void tocar(){
        System.out.println("Prim Prim, olha a música");
    }

    public void pausar() {
        System.out.println("Pausando a sua música");
    }

    public void exibirPagina(){
        System.out.println("Exibindo a página");
    }

    public void atualizarPágina() {
        System.out.println("Atualizando página");
    }

    public void adicionarAba() {
        System.out.println("Abrindo uma Aba");
    }
    public void ligar() {
        System.out.println("Prim Prim, tocando de seu Iphone");
    }

    public void atender() {
        System.out.println("Atendendo de seu Iphone");
    }

    public void correioDeVoz() {
        System.out.println("Você não atendeu o Iphone");
    }

    

    
}
