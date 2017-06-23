import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pro1 {
    public static void main(String args[]){
        List<Float> floatList = new ArrayList<>();

        floatList.add(1.2f);
        floatList.add(3.6f);
        floatList.add(2.2f);
        floatList.add(4.2f);
        floatList.add(5.2f);
        float sum = 0;
        Iterator<Float> floatIterator = floatList.iterator();
        while(floatIterator.hasNext()){
            Float obj = floatIterator.next();
            sum = sum + obj;
        }
        System.out.println(floatList);
        System.out.println("sum is "+sum);
    }
}
