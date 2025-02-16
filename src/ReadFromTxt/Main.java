package ReadFromTxt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Αναπτύξτε μία εφαρμογή που να μπορεί να
 * διαβάζει χαρακτήρα-χαρακτήρα ένα αρχείο
 * κειμένου και να εισάγει τους χαρακτήρες σε
 * μία λίστα διπλής κατεύθυνσης (π.χ.
 * LinkedList)
 * • Στη συνέχεια να εξάγει στατιστικά στοιχεία
 * για κάθε χαρακτήρα, όπως η συχνότητα
 * εμφάνισης, ταξινομημένη 1) ανά χαρακτήρα
 * ascending και 2) ανά ποσοστό descending
 */


public class Main {

    public static void main(String[] args) {

        String file = "E:\\ex01.txt";
        LinkedList<Character> characters = new LinkedList<>();

        try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
            int character;
            while((character = bf.read()) != -1){
                characters.add((char)character);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        HashMap<Character,Integer> charactersCount = new HashMap();

        for (Character ch : characters){
            if (!charactersCount.containsKey(ch) && (Character.isLetter(ch)) || Character.isDigit(ch)){
                charactersCount.put(ch, countCharacter(ch,
                        characters));
            }
        }
        int sum = 0;
        for(int val : charactersCount.values()){
            sum += val;
        }
        System.out.println(sum);

        HashMap<Character,Double> characterPercent = new HashMap<>();

        for(Character ch : charactersCount.keySet()){
            double percent = charactersCount.get(ch)*100.00/sum;
            percent = Math.round(percent * 10000.0)/10000.0;
            characterPercent.put(ch, percent);
        }

        LinkedHashMap<Character, Double> sortedMap = characterPercent.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap :: new
                ));

        System.out.println(sortedMap);

    }

    public static void printLinkedList(LinkedList<Character> list){
        list.forEach(System.out::print);
    }

    public static int countCharacter(char c , LinkedList<Character> list){
        int count = 0;
        for (char ch : list){
            if (ch == c) count += 1;
        }
        return count;
    }


}
