import java.util.*;

public class Pro3 {

    static void uniqueChar(String name){
        List<Character> characterSet = new ArrayList<>();
        for(char c:name.toCharArray()){
            characterSet.add(c);
        }

        Set<Character> uniquearray = new HashSet<>(characterSet);
        Iterator<Character> characterIterator = uniquearray.iterator();
        while (characterIterator.hasNext()){
            Character obj = characterIterator.next();
//TODO: DEclare Character obj outside the loop so that only one reference is created
            System.out.println(obj+" "+Collections.frequency(characterSet,obj));
        }
    }

    public static void main(String[] args)
    {
// TODO: Allow User to enter this
        String name = "My name is ankur";
        uniqueChar(name);
    }
}
