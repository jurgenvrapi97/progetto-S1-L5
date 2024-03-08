package esercizio;

import esential.Immagine;
import esential.RegistrazioneAudio;
import esential.Video;

public class mainEsercizio {
    public static void main(String[] args) {
        Video video = new Video("mamma", 5,9, 5);
        video.abbassaVolume(2);
        video.alzaVolume(6);
        video.abbassaLuminosita(3);
        video.play();

        Immagine img = new Immagine("cane",6);
        img.show();
        img.abbassaLuminosita(3);
        img.show();
    }
}
