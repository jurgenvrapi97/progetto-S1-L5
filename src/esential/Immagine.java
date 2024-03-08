package esential;

public class Immagine extends Multimediale implements Luminosita {

    private int luminosita;

    public Immagine(String title, int luminosita) {
        super(title);
        this.luminosita = luminosita;
    }

    @Override
    public void alzaLuminosita(int luminosita) {
        this.luminosita = this.luminosita + luminosita;
    }

    @Override
    public void abbassaLuminosita(int luminosita) {
        this.luminosita = this.luminosita - luminosita;
    }

    public void show(){
        String luminosita = "*";
        String valoreLuminosita = luminosita.repeat(this.luminosita);
        System.out.println(getTitle()+valoreLuminosita);
    }
}
