package Observer;

public class IncrementalNumberGenerator extends NumberGenerator {
    private int number;
    private int jump;
    private int end;
    public IncrementalNumberGenerator(int number, int end, int jump){
        this.number = number;
        this.jump = jump;
        this.end = end;
    }
    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for(int i = number;i<=end;i+=jump){
            number = i;
            notifyObservers();
        }
    }
}
