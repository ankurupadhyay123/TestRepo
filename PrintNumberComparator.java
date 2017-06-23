import java.util.Comparator;

public class PrintNumberComparator implements Comparator<PrintNumber>{

    @Override
    public int compare(PrintNumber p1, PrintNumber p2) {
        if(p1.sequenceNumber == p2.sequenceNumber){
            if(p1.order == p2.order) return 0;
            if(p1.order > p2.order) return 1;
            else return -1;
        }
        if(p1.sequenceNumber < p2.sequenceNumber) return 1;
        else return -1;
    }
}
