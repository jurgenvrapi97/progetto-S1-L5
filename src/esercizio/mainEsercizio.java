package esercizio;
import esential.Immagine;
import esential.Multimediale;
import esential.RegistrazioneAudio;
import esential.Video;
import java.util.Scanner;
public class mainEsercizio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Multimediale[] file = new Multimediale[5];
        String fine = "";
        int contatore = 0;
        while (!fine.equals("n")) {

            System.out.println("che tipo di file vuoi inserire Immagine(1), Video(2), Registrazione multimediale(3)");
            int scelta = Integer.parseInt(sc.nextLine());

             tipoFile(file, scelta, sc, contatore) ;
            System.out.println("vuoi inserire un altro file? y/n");
             fine = sc.nextLine();

        }

        fine = "";
        int indice;
        while (!fine.equals("n")) {
            System.out.println("quale file vuoi usare?(1,2,3,4,5)");
            indice = Integer.parseInt(sc.nextLine());
        }


    }

    public static void tipoFile(Multimediale[] file, int scelta, Scanner sc, int contatore) {
        switch (scelta) {
            case 1:
                System.out.println("inserisci titolo");
                String imgTitolo = sc.nextLine();
                System.out.println("inserisci luminosità max 10");
                int imgLum = Integer.parseInt(sc.nextLine());
                file[contatore] = new Immagine(imgTitolo,imgLum);
                break;
            case 2:
                System.out.println("inserisci titolo");
                String videoTitolo = sc.nextLine();
                System.out.println("inserisci voulume max 10");
                int videoVol = Integer.parseInt(sc.nextLine());
                System.out.println("inserisci durata max 10");
                int videoDur = Integer.parseInt(sc.nextLine());
                System.out.println("inserisci luminosità max 10");
                int videoLum = Integer.parseInt(sc.nextLine());
                file[contatore] = new Video(videoTitolo, videoVol, videoDur, videoLum);
                break;
            case 3:
                System.out.println("inserisci titolo");
                String audioTitolo = sc.nextLine();
                System.out.println("inserisci voulume max 10");
                int audioVol = Integer.parseInt(sc.nextLine());
                System.out.println("inserisci durata max 10");
                int audioDur = Integer.parseInt(sc.nextLine());

                file[contatore] = new RegistrazioneAudio(audioTitolo, audioVol, audioDur);
                break;
            default:
                System.out.println("non supportiamo questo tipo di file");

        }

    }

    public static void tipoFile(Multimediale[] file, int indice){

        if (indice >= 0 && indice < file.length){

        }


        }
    }
}
