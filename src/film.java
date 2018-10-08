//NAMA  :Aldi Lesmana 
//NIM   :10117108    
//KELAS :IF-3

/**
 *
 * @author RIA FITRIANI
 */
public class film {
    public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;

    public void nowPlaying(String parJudul, String parGenre, double parRating, int parDuration){
        System.out.println("Judul Film  : "+parJudul);
        System.out.println("Genre Film  : "+parGenre);
        System.out.println("Rating Film : "+parRating);
        System.out.println("Duration Film : "+parDuration+" menit\n");
    }
}

