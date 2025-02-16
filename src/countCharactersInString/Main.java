package countCharactersInString;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


    }

    public static Map<Character, Integer> count(String str) {
        char[] characters = str.toCharArray();
        Map<Character, Integer> mapToReturn = new HashMap<>();
        for(char c : characters){
            if (!mapToReturn.containsKey(c)){
                mapToReturn.put(c,1);
            }else {
                mapToReturn.put(c,(mapToReturn.get(c)+1));
            }
        }
        return mapToReturn;
    }

}
