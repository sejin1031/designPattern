package Proxy;

public class Printer implements Printable{
    private String name;
    public Printer(){
        heavyJob("인스턴스를 생성중");
    }
    public Printer(String name) {
        this.name = name;
        heavyJob("Printer의 은스턴스 (" + name + ")을 생성중");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    public String getPrinterName(){
        return name;
    }
    public void print(String string){
        System.out.println("===" + name + "===");
        System.out.println(string);
    }
    private void heavyJob(String msg){
        System.out.println(msg);
        for (int i = 0 ;i < 5; i++){
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
            }
            System.out.print(".");
        }
        System.out.println("완료");
    }
}
