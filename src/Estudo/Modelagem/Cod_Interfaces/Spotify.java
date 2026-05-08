package Estudo.Modelagem.Cod_Interfaces;

public class Spotify implements ReprodutorMusical {
    public void tocar() {
        System.out.println("Spotify tocando musica");
    }
    public void pausar() {
        System.out.println("Spotify pausado");
    }
    public void selecionarMusica(String musica) {
        System.out.println("Spotify selecionou: " + musica);
    }
}