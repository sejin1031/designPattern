package State;

public class Main {
    public static void main(String... args){
        SafeFrame frame = new SafeFrame("State sample");
        while(true){
            for( int hour = 0; hour < 24;hour++){
                frame.setClock(hour);
                try{
                    Thread.sleep(100);
                } catch (InterruptedException e){
                }
            }
        }
    }
}
