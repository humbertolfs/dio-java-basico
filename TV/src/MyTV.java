public class MyTV {

    private int channel = 0;
    private int volume = 0;
    private boolean isOn = false;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void setChannel(int newChannel) {
        if (isOn && newChannel >= 1 && newChannel <= 120) {
            channel = newChannel;
        }
    }

    public void setVolume(int newVolumeLevel) {
        if (isOn && newVolumeLevel >= 1 && newVolumeLevel <= 7) {
            volume = newVolumeLevel;
        }
    }

    public void channelUp() {
        if (isOn && channel < 120) {
            channel++;
        }
    }

    public void channelDown() {
        if (isOn && channel > 1) {
            channel--;
        }
    }

    public void volumeUp() {
        if (isOn && volume < 7) {
            volume++;
        }
    }

    public void volumeDown() {
        if (isOn && volume > 1) {
            volume--;
        }
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isOn() {
        return isOn;
    }
}