import java.util.*;

public class PrintNumber {

    static int counter;
    int number,sequenceNumber,order;

    public PrintNumber(int number, int sequenceNumber,int counter) {

        this.number=number;
        this.sequenceNumber=sequenceNumber;
        this.order=counter;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public int getNumber() {
        return number;
    }

    public String toString(){
        return number+":"+sequenceNumber;
    }
}
