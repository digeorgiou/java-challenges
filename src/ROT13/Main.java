package ROT13;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * ROT13 is a simple letter substitution cipher that replaces a letter with
 * the letter 13 letters after it in the alphabet.
 * ROT13 is an example of the Caesar cipher.
 *
 * Create a function that takes a string and returns the string ciphered with Rot13.
 * If there are numbers or special characters included in the string,
 * they should be returned as they are.
 * Only letters from the latin/english alphabet should be shifted,
 * like in the original Rot13 "implementation".
 */

public class Main {

    public static void main(String[] args) {

        System.out.println(rot13("test"));
    }

    public static String rot13(String str) {
        char[] characters = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(char c : characters){
            if(!Character.isLetter(c)) sb.append(c);
            else{
                if(Character.isUpperCase(c)){
                    int charNumUpper = (int) c;
                    int newCharNumU = (65 + ((charNumUpper-65)+13)%26);
                    char newCharUp = (char) (newCharNumU);
                    sb.append(newCharUp);}
                else{
                    int charNumLower = (int) c;
                    int newCharNum = (97 +((charNumLower-97) + 13)%26);
                    char newCharL = (char) newCharNum;
                    sb.append(newCharL);
                }
            }
        }

        return sb.toString();
    }

    public static String BetterRot13(String str) {
        return str.chars().map(c -> 'A' <= c && c <= 'Z' ? (c - 'A' + 13) % 26 + 'A' :
                        'a' <= c && c <= 'z' ? (c - 'a' + 13) % 26 + 'a' : c)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }

    public static String OtherRot13(String str) {
        return str
                .chars()
                .mapToObj(c -> {
                    if (c >= 'a' && c <= 'z') {
                        return Character.toString((c + 13) > 'z' ? (c - 13) : c + 13);
                    }
                    if (c >= 'A' && c <= 'Z') {
                        return Character.toString((c + 13) > 'Z' ? (c - 13) : c + 13);
                    }
                    return Character.toString(c);
                })
                .collect(Collectors.joining());
    }
}
