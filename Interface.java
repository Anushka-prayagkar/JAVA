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
    public void videoCall() {
        System.out.println("SMart Phone video calling.");
    }
    public void clickPicture() {
        System.out.println("Smart Phone clicking picture.");
    }
    public void recordVideo() {
        System.out.println("Smart Phone recording video.");
    }
    public void playMusic() {
        System.out.println("Smart Phone playing music.");
    }
    public void stopMusic() {
        System.out.println("Smart Phone stop playing music.");
    }
}


public class Interface {
    public static void main(String[] args) {
                
    }
}
