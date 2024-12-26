package FindNextHigherNumber;

/**
 * Your task is to find the next higher number (int) with the same number of '1'- Bits.
 *
 * I.e. as many 1 bits as before and output next higher than input.
 * Input is always an int between 1 and 1<<30 (possibly inclusive).
 *
 * Some easy examples:
 * Input: 129  => Output: 130 (10000001 => 10000010)
 * Input: 127 => Output: 191 (01111111 => 10111111)
 * Input: 1 => Output: 2 (01 => 10)
 * Input: 323423 => Output: 323439 (1001110111101011111 => 1001110111101101111)
 */


public class FindNextHigherNumber {
    public static void main(String[] args) {

        System.out.println(nextHigher(1022));


    }


public static int nextHigher(int n) {
    String binary = "0"+Integer.toBinaryString(n);
    int ones = 0;
    int zeros = 0;
    for (int i = binary.length()-1; i >= 1; i--){
        if(binary.charAt(i) == 49 && binary.charAt(i-1) == 48){
            binary = binary.substring(0, i-1) + "10";
            break;
        } else if(binary.charAt(i) == 49) {
            ones++;
            binary = binary.substring(0, i);
        } else zeros++;
    }

    return Integer.parseInt(binary+"0".repeat(zeros)+"1".repeat(ones), 2);

}

    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        // Continue dividing the decimal number by 2 until it becomes 0
        while (decimal > 0) {
            // Get the remainder when dividing by 2
            int remainder = decimal % 2;
            // Prepend the remainder of the binary representation
            binary.insert(0, remainder);
            // Update the quotient for the next iteration
            decimal = decimal / 2;
        }
        // If the input decimal was 0, return "0"
        if (binary.length() == 0) {
            binary.append("0");
        }
        return binary.toString();
    }

}