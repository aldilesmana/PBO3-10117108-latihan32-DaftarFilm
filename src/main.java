//NAMA  :Aldi Lesmana
//NIM   :10117108    
//KELAS :IF-3

/**
 *
 * @author Aldi Lesmana
 */
public class main {
    public static void main(String[] args) {
        System.out.println("===Daftar Film Sedang Tayang===\n");

        film film1 = new film();
        film1.filmName = "Venom";
        film1.filmGenre = "Action, Horor, Scifi";
        film1.filmRating = 8.5;
        film1.filmDuration = 120;
        film1.nowPlaying(film1.filmName, film1.filmGenre, film1.filmRating, film1.filmDuration);

        film film2 = new film();
        film2.filmName = "Small Foot";
        film2.filmGenre = "Animation";
        film2.filmRating = 9.0;
        film2.filmDuration = 96;
        film2.nowPlaying(film2.filmName, film2.filmGenre, film2.filmRating, film2.filmDuration);

        film film3 = new film();
        film3.filmName = "Crazy Rich Asian";
        film3.filmGenre = "Comedy";
        film3.filmRating = 7.8;
        film3.filmDuration = 119;
        film3.nowPlaying(film3.filmName, film3.filmGenre, film3.filmRating, film3.filmDuration);

        film film4 = new film();
        film4.filmName = "Asih";
        film4.filmGenre = "Horor";
        film4.filmRating = 6.0;
        film4.filmDuration = 100;
        film4.nowPlaying(film4.filmName, film4.filmGenre, film4.filmRating, film4.filmDuration);

    }
    
}

