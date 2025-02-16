package DetectPangram;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * A pangram is a sentence that contains every single letter of the alphabet at least once.
 * For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram,
 * because it uses the letters A-Z at least once (case is irrelevant).
 *
 * Given a string, detect whether or not it is a pangram.
 * Return True if it is, False if not. Ignore numbers and punctuation.
 *
 */

public class Main {

    public static void main(String[] args) {

        System.out.println(check("The quick brown fox jumps over the lazy dog"));
    }
    public static boolean check(String sentence){
        char[] letters = sentence.toCharArray();
        Set<Character> appearances = new HashSet<>();
        for(char c : letters){
            if(Character.isLetter(c)){
            appearances.add(Character.toLowerCase(c));
            }
        }
        return (appearances.size() == 26);
    }

    public static boolean check2(String sentence){
        return sentence.chars()
                .map(Character::toLowerCase)
                .filter(Character::isAlphabetic)
                .distinct()
                .count() == 26;
    }

    boolean check3(final String sentence) {
        return sentence.chars()
                .filter(Character::isLetter)
                .map(Character::toLowerCase)
                .distinct()
                .count() == 26;
    }
}
