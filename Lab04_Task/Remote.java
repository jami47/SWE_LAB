


public class Remote {
    TV tv;

    Remote(TV teleVision){
        if(tv==null)
            tv = teleVision;
    }
    
    void togglePower(){
        if(tv.isEnabled())
            tv.disable();
        else
            tv.disable();
    }

    void volumeUp(){
        int vol = tv.getVolume();
        tv.setVolume(vol+1);
    }
    void volumeDown(){
        int vol = tv.getVolume();
        tv.setVolume(vol-1);
    }
    void channelUp(){
        int chl = tv.getChannel();
        tv.setChannel(chl+1);
    }
    void channelDown(){
        int chl = tv.getChannel();
        tv.setChannel(chl-1);
    }
}
