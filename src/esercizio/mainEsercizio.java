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

            tipoFile(file, scelta, sc, contatore);
            contatore++;
            System.out.println("vuoi inserire un altro file? y/n");
            fine = sc.nextLine();

        }

        fine = "";
        int indice;
        while (true) {
            System.out.println("inserisci (1,2,3,4,5) per selezionare un file oppure '0' per uscire");
            indice = Integer.parseInt(sc.nextLine());
            if (indice == 0) {
            break;
            } else {

                tipoDiFile(file[indice - 1], indice);
            }
        }


    }


    public static void tipoFile(Multimediale[] file, int scelta, Scanner sc, int contatore) {
        switch (scelta) {
            case 1:
                System.out.println("inserisci titolo");
                String imgTitolo = sc.nextLine();
                System.out.println("inserisci luminosità max 10");
                int imgLum = Integer.parseInt(sc.nextLine());
                file[contatore] = new Immagine(imgTitolo, imgLum);
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

    public static void tipoDiFile(Multimediale file, int indice) {

        if (indice >= 0) {
            if (file instanceof Immagine) {
                System.out.println("hai selezionato una immagine");
                Immagine immagine = (Immagine) file;
                eseguiImg(immagine);
            } else if (file instanceof Video) {
                System.out.println("hai selezionato un video");
                Video video = (Video) file;
                eseguiVideo(video);
            } else if (file instanceof RegistrazioneAudio) {
                System.out.println("hai selezionato un audio");
                RegistrazioneAudio audio = (RegistrazioneAudio) file;
                eseguiAudio(audio);
            }
        }


    }


    public static void eseguiImg(Immagine tipo) {
        Scanner scanner = new Scanner(System.in);
        int scelta;
        System.out.println("premi '1' mostrare immagine o '2' per cambiare l'uminosità");
        scelta = Integer.parseInt(scanner.nextLine());
        if (scelta == 1) {
            tipo.show();
        } else {
            System.out.println("la luminosità attuale è " + tipo.getLuminosita() + " '1' per alzare '2' per abbassare");
            int richiesta;
            richiesta = Integer.parseInt(scanner.nextLine());
            if (richiesta == 1) {
                System.out.println("di quanto?");
                int valore;
                valore = Integer.parseInt(scanner.nextLine());
                int max = tipo.getLuminosita() + valore;
                if (max < 10) {
                    tipo.alzaLuminosita(valore);
                    tipo.show();
                } else {
                    System.out.println("ha inserito un valore troppo alto riprova");
                }
            } else {
                System.out.println("di quanto?");
                int valore;
                valore = Integer.parseInt(scanner.nextLine());
                int min = tipo.getLuminosita() + valore;
                if (min < 0) {
                    tipo.abbassaLuminosita(valore);
                    tipo.show();
                } else {
                    System.out.println("ha inserito un valore troppo alto riprova");
                }
            }
        }
    }

    public static void eseguiVideo(Video tipo) {
        Scanner scanner = new Scanner(System.in);
        int scelta;
        System.out.println("premi '1' riprodurre video, '2' per cambiare l'uminosità o '3' per cambiare volume");
        scelta = Integer.parseInt(scanner.nextLine());
        if (scelta == 1) {
            tipo.play();
        } else if (scelta == 2) {
            System.out.println("la luminosità attuale è " + tipo.getLuminosita() + " '1' per alzare '2' per abbassare");
            int richiesta;
            richiesta = Integer.parseInt(scanner.nextLine());
            if (richiesta == 1) {
                System.out.println("di quanto?");
                int valore;
                valore = Integer.parseInt(scanner.nextLine());
                int max = tipo.getLuminosita() + valore;
                if (max < 10) {
                    tipo.alzaLuminosita(valore);
                    tipo.play();
                } else {
                    System.out.println("ha inserito un valore troppo alto riprova");
                }
            } else {
                System.out.println("di quanto?");
                int valore;
                valore = Integer.parseInt(scanner.nextLine());
                int min = tipo.getLuminosita() - valore;
                if (min < 0) {
                    tipo.abbassaLuminosita(valore);
                    tipo.play();
                } else {
                    System.out.println("ha inserito un valore troppo alto riprova");
                }
            }
        } else {
            System.out.println("'1' per alzare o '2' per abbassare");
            int sceltaVol;
            sceltaVol = Integer.parseInt(scanner.nextLine());

            if (sceltaVol < 1) {
                System.out.println("di quanto vui alzare");
                int volumeUp;
                volumeUp = Integer.parseInt(scanner.nextLine());
                int max = tipo.getVolume() + volumeUp;
                if (max < 10) {
                    tipo.alzaVolume(volumeUp);
                    tipo.play();
                } else {
                    System.out.println("valore troppo alto");
                }
            } else {
                System.out.println("di quatno vuoi abbassare?");
                int volumedown;
                volumedown = Integer.parseInt(scanner.nextLine());
                int min = tipo.getVolume() - volumedown;
                if (min > 0) {
                    tipo.abbassaVolume(volumedown);
                    tipo.play();
                } else {
                    System.out.println("non pui inserire questo valore");
                }
            }
        }
    }

    public static void eseguiAudio(RegistrazioneAudio tipo) {
        Scanner scanner = new Scanner(System.in);
        int scelta;
        System.out.println("premi '1' riprodurre audio o '2' per cambiare volume");
        scelta = Integer.parseInt(scanner.nextLine());
        if (scelta == 1) {
            tipo.play();
        } else {
            System.out.println("'1' per alzare o '2' per abbassare");
            int sceltaVol;
            sceltaVol = Integer.parseInt(scanner.nextLine());

            if (sceltaVol < 1) {
                System.out.println("di quanto vui alzare");
                int volumeUp;
                volumeUp = Integer.parseInt(scanner.nextLine());
                int max = tipo.getVolume() + volumeUp;
                if (max < 10) {
                    tipo.alzaVolume(volumeUp);
                    tipo.play();
                } else {
                    System.out.println("valore troppo alto");
                }
            } else {
                System.out.println("di quatno vuoi abbassare?");
                int volumedown;
                volumedown = Integer.parseInt(scanner.nextLine());
                int min = tipo.getVolume() - volumedown;
                if (min > 0) {
                    tipo.abbassaVolume(volumedown);
                    tipo.play();
                } else {
                    System.out.println("non pui inserire questo valore");
                }
            }
        }
    }
}

