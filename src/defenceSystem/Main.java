package defenceSystem;

public class Main {
    public static void main(String[] args) {
        Controller controlRoom=new Controller();
        controlRoom.addObserver(new mainController(controlRoom));
        controlRoom.addObserver(new Helicopter(controlRoom));
        controlRoom.addObserver(new Tank(controlRoom));
        controlRoom.addObserver(new subMarine(controlRoom));
        
    }
}
