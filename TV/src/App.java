public class App {
    public static void main(String[] args) {
        MyTV tv = new MyTV();
        tv.turnOn();
        tv.setChannel(30);
        tv.setVolume(3);

        System.out.println("Channel: " + tv.getChannel());
        System.out.println("Volume: " + tv.getVolume());
        System.out.println("Is TV on? " + tv.isOn());

        tv.channelUp();
        tv.volumeUp();

        System.out.println("Channel: " + tv.getChannel());
        System.out.println("Volume: " + tv.getVolume());
        System.out.println("Is TV on? " + tv.isOn());

        tv.turnOff();

        System.out.println("Channel: " + tv.getChannel());
        System.out.println("Volume: " + tv.getVolume());
        System.out.println("Is TV on? " + tv.isOn());
    }
}
