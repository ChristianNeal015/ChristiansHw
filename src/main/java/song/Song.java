package song;

public class Song {
    public String title;
    public String artist;

    public Song(String title, String artist){
    this.title = title;
    this.artist = artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void play(){
        System.out.println(title);
    }
    public void favoriteTrack(String[] songs){
        System.out.println(songs[songs.length - 2]);
    }
    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
