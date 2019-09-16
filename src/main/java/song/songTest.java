package song;

public class songTest {
    public static void main(String[] args) {
        String[] songs = new String[]{"Over", "Just how it is", "Ransom", "Lucid Dreams"};
        Song song1 = new Song("Over", "Drake");
        song1.favoriteTrack(songs);
    }
}
