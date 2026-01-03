class Phone {
    public void call() {
        System.out.println("Phone call.");
    }
    public void sms() {
        System.out.println("Phone sms.");
    }
}

interface iCamera {
    void clickPicture();
    void recordVideo();
}

interface iMusicPlayer {
    void playMusic();
    void stopMusic();
}

class SmartPhone extends Phone implements iCamera, iMusicPlayer{

}


public class Interface {
    public static void main(String[] args) {
                
    }
}
