package Modelagem.Cod_Interfaces;

public class Main {

    // esse método aceita QUALQUER reprodutor, não importa qual
    static void iniciarReprodutor(ReprodutorMusical reprodutor, String musica) {
        reprodutor.selecionarMusica(musica);
        reprodutor.tocar();
    }

    public static void main(String[] args) {

        ReprodutorMusical spotify = new Spotify();
        ReprodutorMusical youtube = new YoutubeMusic();

        iniciarReprodutor(spotify, "Bohemian Rhapsody");
        iniciarReprodutor(youtube, "Stairway to Heaven");

    }

}