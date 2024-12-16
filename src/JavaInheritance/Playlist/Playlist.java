package JavaInheritance.Playlist;

import java.util.Random;

public class Playlist {
    public String title;
    public String[] videos;
    public int videoNumber;

    Playlist(String title){
        this.title = title;
        videos = new String[10];
        videoNumber = 0;
    }

    public void addNewVideo(String video){
        if (videoNumber == 10) {
            System.out.println("Playlist is full");
            return;
        }
        this.videos[videoNumber] = video;
        videoNumber += 1;
    }

    public String recommendation() {
        if (videoNumber == 0){
            System.out.println("Playlist is empty");
            return null;
        }
        Random ran = new Random();
        int j = ran.nextInt(videoNumber);
        return this.videos[j];
    }

    public void print() {
        System.out.println("Playlist " + title + " contains: ");
        for (int i = 0 ; i < videoNumber ; i++){
            System.out.println(this.videos[i]);
        }
    }




}
