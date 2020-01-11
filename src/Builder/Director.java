package Builder;

public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }
    public void construct(){
        builder.makeTitle("Greeting");
        builder.makeString("아침과 낮에");
        builder.makeItems(new String[] {
                "안녕하세요",
                "안녕히 주무세요",
                "안녕히 계세요"
        });
        builder.close();
    }
}
