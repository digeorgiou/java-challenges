package JavaInheritance.Playlist;

public class PlaylistTutorial extends  Playlist{
    String subject;

    PlaylistTutorial(String title, String subject){
        super(title);
        this.subject = subject;
    }

    public String recommendation() {
        if(videoNumber == 0) {
            System.out.println("Playlist is empty");
            return null;
        }
        return this.videos[0];
    }
}
