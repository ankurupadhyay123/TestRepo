import java.util.*;

public class Pro6 {

    public static void main(String[] args) {

        int arr[] = {9,7,5,4,9,4,8,9,7,9,5,8,4};
        List<PrintNumber> list = new ArrayList<>();
        int flag = 0;
        for(int i:arr){
            for (PrintNumber p : list){
                if(p.number==i){
                    p.setSequenceNumber(p.getSequenceNumber()+1);
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                list.add(new PrintNumber(i,1,PrintNumber.counter));
                PrintNumber.counter++;
            }
            else{
                flag=0;
            }
        }
        list.sort(new PrintNumberComparator());
        Iterator<PrintNumber> printNumberIterator= list.iterator();
        while (printNumberIterator.hasNext()){
            PrintNumber obj = printNumberIterator.next();
            System.out.println("Number:"+obj.number+" Frequency:"+obj.sequenceNumber);
        }
        }

}
