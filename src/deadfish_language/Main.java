package deadfish_language;

import java.util.ArrayList;

/**
 * Create a parser to interpret and execute the Deadfish language.
 *
 * Deadfish operates on a single value in memory, which is initially set to 0.
 *
 * It uses four single-character commands:
 *
 * i: Increment the value
 * d: Decrement the value
 * s: Square the value
 * o: Output the value to a result array
 * All other instructions are no-ops and have no effect.
 *
 * Examples
 * Program "iiisdoso" should return numbers [8, 64].
 * Program "iiisdosodddddiso" should return numbers [8, 64, 3600].
 */

public class Main {

    public static void main(String[] args) {

    }

    public static int[] parse(String data) {
        ArrayList<Integer> arr = new ArrayList<>();

        char[] letters = data.toCharArray();
        int value = 0;
        for(char letter : letters){
            switch (letter) {
                case 'i':
                    value ++;
                    break;
                case 'd':
                    value --;
                    break;
                case 's':
                    value = value * value;
                    break;
                case 'o':
                    arr.add(value);
                    break;
                default:
                    break;
            }
        }
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }


}
