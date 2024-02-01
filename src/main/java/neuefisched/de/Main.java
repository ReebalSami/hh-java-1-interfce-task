package neuefisched.de;


public class Main {
    public static void main(String[] args) {

        MediaController mediaController = new MediaController();

        // Creating instances of MusicPlayer and VideoPlayer
        MusicPlayer musicPlayer = new MusicPlayer("Every breath you take", "The Police", 1983, "Soft Rock");
        VideoPlayer videoPlayer = new VideoPlayer("Un-Break My Heart", "Toni Braxton", 1996, "Soul", true);



        mediaController.playMedia(musicPlayer);
        System.out.println();
        mediaController.playMedia(videoPlayer);

    }
}