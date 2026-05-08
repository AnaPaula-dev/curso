package Estudo.Modelagem.Cod_Interfaces;

public class YoutubeMusic implements ReprodutorMusical {
    public void tocar() {
        System.out.println("Youtube Music tocando musica");
    }
    public void pausar() {
        System.out.println("Youtube Music pausado");
    }
    public void selecionarMusica(String musica) {
        System.out.println("Youtube Music selecionou: " + musica);
    }
}