package esential;

public class RegistrazioneAudio extends Multimediale implements Riproducibile{
    private int volume;
    private int durata;

    public RegistrazioneAudio(String title, int volume, int durata) {
        super(title);
        this.volume = volume;
        this.durata = durata;
    }




    @Override
    public void abbassaVolume(int volume) {
        this.volume = this.volume - volume;
    }

    @Override
    public void alzaVolume(int volume) {
        this.volume = this.volume + volume;
    }
    @Override
    public void play() {
        String volume = "!";
        String valoreVolume= volume.repeat(this.volume);

        for (int i = 0; i < this.durata; i++) {
            System.out.println(getTitle()+valoreVolume);
        }
    }




}
