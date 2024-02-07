public class Adapter extends SmartRemote{

    Adapter(TV teleVision) {
        super(teleVision);
    }
    void showYoutube(){
        ((SmartTV)tv).youtube();
    }
    
}
