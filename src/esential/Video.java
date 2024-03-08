package esential;

public class Video extends Multimediale implements Riproducibile, Luminosita{
    private int volume;
    private int durata;
    private int luminosita;

    public Video(String title, int volume, int durata, int luminosita) {
        super(title);
        this.volume = volume;
        this.durata = durata;
        this.luminosita = luminosita;
    }

    @Override
    public void play() {
        String volume = "!";
        String valoreVolume= volume.repeat(this.volume);
        String luminosita = "*";
        String valoreLuminosita = luminosita.repeat(this.luminosita);
        for (int i = 0; i < this.durata; i++) {
            System.out.println(getTitle()+valoreVolume+" "+ valoreLuminosita);
        }
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
    public void alzaLuminosita(int luminosita) {
        this.luminosita = this.luminosita + luminosita;
    }

    @Override
    public void abbassaLuminosita(int luminosita) {
        this.luminosita = this.luminosita - luminosita;
    }
}
