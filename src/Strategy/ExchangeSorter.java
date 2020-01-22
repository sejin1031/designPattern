package Strategy;

public class ExchangeSorter implements Sorter {
    @Override
    public void sort(Comparable[] data) {
        for(int i = 0;i<data.length;i++){
            for(int j = data.length-1;j>i;j--){
                if(data[j].compareTo(data[j-1]) < 0){
                    Comparable tmp = data[j-1];
                    data[j-1] = data[j];
                    data[j] = tmp;
                }
            }
        }
    }
}
