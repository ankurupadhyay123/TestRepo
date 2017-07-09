import java.util.*;

public class Pro2 {

    static List<Character> uniqueChar(String name){
        List<Character> characterSet = new ArrayList<>();
        for(char c:name.toCharArray()){
            characterSet.add(c);
        }

        Iterator<Character> characterIterator = characterSet.iterator();
        List<Character> newcharacterSet = new ArrayList<>();
        while (characterIterator.hasNext()){
            Character obj = characterIterator.next();
//TODO: DEclare Character obj outside the loop so that only one reference is created
            if(Collections.frequency(characterSet,obj) == 1){
                newcharacterSet.add(obj);
            }
        }
        return newcharacterSet;
    }

    public static void main(String[] args)
    {
        Set<Character> chararray;
        String name = "My name is ankur";
// TODO: Allow User to enter this
        System.out.println("Unique characters are:");
        System.out.println(uniqueChar(name).toString());
// TODO: Question was to print number of unique Charactes
    }
}
