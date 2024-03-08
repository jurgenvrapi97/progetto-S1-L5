package esercizio;

import esential.RegistrazioneAudio;

public class mainEsercizio {
    public static void main(String[] args) {
        RegistrazioneAudio audio = new RegistrazioneAudio("mamma", 5,9);
        audio.abbassaVolume(2);
        audio.alzaVolume(6);
        audio.play();
    }
}
