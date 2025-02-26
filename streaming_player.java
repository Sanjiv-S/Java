interface Mediaplayer{
    void play();
    void pause();
    void stop();
}
class Audioplayer implements Mediaplayer{
    public void play(){
        System.out.println("for playing MP3 files");
    }
    public void pause(){
        System.out.println("for pausing MP3 files");
    }
    public void stop(){
        System.out.println("for stoping  MP3 files");
    }
}
class Videoplayer implements Mediaplayer{
    public void play(){
        System.out.println("for playing MP4 files");
    }
    public void pause(){
        System.out.println("for pausing MP4 files");
    }
    public void stop(){
        System.out.println("for stoping  MP4 files");
    }
}
class streamingplayer implements Mediaplayer {
    public void play(){
        System.out.println("for playing online content");
    }
    public void pause(){
        System.out.println("for pausing online content");
    }
    public void stop(){
        System.out.println("for stoping online content");
    }
    public static void main(String args[]){
        streamingplayer sp =new streamingplayer();
        Videoplayer vp= new Videoplayer();
        Audioplayer ap =new Audioplayer();
        sp.play();+
        sp.pause();
        sp.stop();
        System.out.println();
        vp.play();
        vp.pause();
        vp.stop();
        System.out.println();
        ap.play();
        ap.pause();
        ap.stop();
    }
}
