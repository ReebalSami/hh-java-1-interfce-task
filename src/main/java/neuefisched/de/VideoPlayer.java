package neuefisched.de;

public class VideoPlayer extends MusicPlayer implements Playable {
    private Boolean isVideoClip;

    // constructor:
    public VideoPlayer(String title, String artist, int year, String genre, Boolean isVideoClip) {
        super(title, artist, year, genre);
        this.isVideoClip = isVideoClip;
    }



    //getter and stter:
    public Boolean getVideoClip() {
        return isVideoClip;
    }

    public void setVideoClip(Boolean videoClip) {
        this.isVideoClip = videoClip;
    }


    //toString:


    @Override
    public String toString() {
        return "VideoPlayer{" +
                "videoClip=" + isVideoClip +
                "} " + super.toString();
    }

    @Override
    public void play() {
        if (Boolean.TRUE.equals(isVideoClip)){
            System.out.printf("Now playing a video of the song %s by %s from %d.", getTitle(), getArtist(), getYear());
        }


    }
}

