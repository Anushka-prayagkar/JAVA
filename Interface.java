class Phone {
    public void call() {
        System.out.println("Phone call.");
    }
    public void sms() {
        System.out.println("Phone sms.");
    }
}

interface iCamera {

}

interface iMusicPlayer {

}

class SmartPhone extends Phone implements iCamera, iMusicPlayer{

}


public class Interface {
    public static void main(String[] args) {
                
    }
}
