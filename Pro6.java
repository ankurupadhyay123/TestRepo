import java.util.*;

public class Pro6 {

   public static void main(String[] args) {

// // TODO: Allow User to enter this

//        int arr[] = {9, 7, 5, 4, 9, 4, 8, 9, 7, 9, 5, 8, 4};
	int arr[] = new int[10];
	Scanner sc=new Scanner(System.in);  
	System.out.println("Enter elements less than 20");
	for(int i = 0; i<10;i++){
		arr[i]=sc.nextInt();
	}

        List<PrintNumber> list = new ArrayList<>();
        int flag = 0;
        for (int i : arr) {
            for (PrintNumber p : list) {
                if (p.number == i) {
                    p.setSequenceNumber(p.getSequenceNumber() + 1);
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                list.add(new PrintNumber(i, 1, PrintNumber.counter));
                PrintNumber.counter++;
            } else {
                flag = 0;
            }
        }
        list.sort(new PrintNumberComparator());
        Iterator<PrintNumber> printNumberIterator = list.iterator();
        while (printNumberIterator.hasNext()) {
            //TODO: DEclare PrintNumber obj outside the loop so that only one reference is created
            PrintNumber obj = printNumberIterator.next();
            System.out.println("Number:" + obj.number + " Frequency:" + obj.sequenceNumber);
        }
    }

}
//Output of the question is :
//Number:9 Frequency:4
//Number:4 Frequency:3
//      Number:7 Frequency:2
//    Number:5 Frequency:2
//  Number:8 Frequency:2
// TODO: As per the question if 2 numbers have same frequency then print the one which came first. So 5 and 8 should not be in the output

