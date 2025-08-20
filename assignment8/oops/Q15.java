import java.lang.Math;
import java.util.ArrayList;
class MusicLibrary{
    ArrayList<String> songs = new ArrayList<String>();
    public void playSong(){
        if(songs.size() == 0){
            System.out.print("No song to play");
        }else {
            int idx = (int)(Math.random()*songs.size());
            System.out.println("Song is playing : "+songs.get(idx));
        }
    }
    public void addSong(String song){
        songs.add(song);
    }
    public void removeSong(String song){
        songs.remove(song);
    }
    public void printSongs(){
        for(String s : songs){
            System.out.println(s);
        }
    }
}
class Test{
    public static void main(String args[]){
        MusicLibrary myMusic = new MusicLibrary();
        myMusic.addSong("E mere hamsafher");
        myMusic.addSong("Ranjhnaa");
        myMusic.addSong("pal pal dil ke pass");
        myMusic.addSong("Softely");
        myMusic.addSong("Hai apna dil");
        myMusic.playSong();
    }
}