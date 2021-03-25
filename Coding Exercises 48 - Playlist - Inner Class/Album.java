import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    // write code here
    private String name, artist;
    private SongList songs;
    
    public Album(String name, String artist){
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }
    
    public boolean addSong(String title, double duration){
        return this.songs.add(new Song(title,duration));
    }
    
    public boolean addToPlayList(int track,LinkedList<Song> playlist){
        Song checkSong = songs.findSong(track);
        if(checkSong != null){
            playlist.add(checkSong);
            return true;
        }
        return false;
    }
    
    public boolean addToPlayList(String title,LinkedList<Song> playlist){
        Song checkSong = songs.findSong(title);
        if(checkSong != null){
            playlist.add(checkSong);
            return true;
        }
        return false;
    }
    
    public static class SongList{
        private ArrayList<Song> songs;
        
        
        private SongList(){
            songs = new ArrayList<Song>();
        }
        
        private boolean add(Song song){
            if(songs.contains(song)){
                return false;
            }
            songs.add(song);
            return true;
        }
        
        private Song findSong(String title){
            for(int i=0;i<songs.size();i++){
                Song song = songs.get(i);
                if(song.getTitle().equals(title)){
                    return song;
                }
            }
            return null;
        }
        
        private Song findSong(int track){
            int count = track -1;
            if(count>0 && count<songs.size()){
                return songs.get(count);
            }
            return null;
        }
        
    }
    
}