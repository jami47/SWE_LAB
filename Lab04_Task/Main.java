//* Roll:  2007047
//! Name: Hemayetul Islam Jami


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");


        GeneralTV generalTV = new GeneralTV();
        SmartTV smartTV = new SmartTV();

        //* Remote can access GeneralTV
        Remote remote = new Remote(generalTV);
        System.out.println(generalTV.getVolume());
        remote.volumeUp();
        System.out.println(generalTV.getVolume());
        //System.out.println(generalTV.hashCode());

        //* Remote can access SmartTV
        Remote remote2 = new Remote(smartTV);
        System.out.println(smartTV.getChannel());
        remote2.channelUp();
        System.out.println(smartTV.getChannel());

        //* SmartRemote can access Youtube Using adapter pattern
        SmartRemote smartRemote = new Adapter(smartTV);
        smartRemote.showYoutube();
    }
}

//! Lab4 SWE-> Try to use Adapter or Bridge Pattern.
//* https://code.visualstudio.com/docs/java/java-tutorial