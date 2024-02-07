//package Lab4;

public class GeneralTV implements TV{
    boolean powerOn=false;
    int volume = 50;
    int channel = 20;

    @Override
    public boolean isEnabled() {
        if(powerOn==false)
            return false;
        else
            return true;
    }

    @Override
    public void enable() {
        this.powerOn = true;
    }

    @Override
    public void disable() {
        powerOn = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }
}