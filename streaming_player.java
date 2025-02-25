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
class Video_player implements Mediaplayer{
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
class streaming_player implements Mediaplayer {
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
        streaming_player sp =new streaming_player();
        sp.play();
        sp.pause();
        sp.stop();
    }
}
