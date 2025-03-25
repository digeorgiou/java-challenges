package LinkedLists.Ex02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IndexList {

    private ArrayList<LinkedList<String>> ar1;

    public IndexList() {
        this.ar1 = new ArrayList<>(26);

        for(int i = 0 ; i < 26 ; i++){
            ar1.add(new LinkedList<>());
        }
    }

    public void add(String s){
        char startingLetter = s.toLowerCase().charAt(0);
        int letterIndex = startingLetter - 'a';

        if(!ar1.get(letterIndex).contains(s)) {
            ar1.get(letterIndex).add(s);
        } else {
            System.out.println("String " + s + "already exists!");
        }
    }

    public ArrayList<LinkedList<String>> getAr1() {
        return ar1;
    }

    public void setAr1(ArrayList<LinkedList<String>> ar1) {
        this.ar1 = ar1;
    }

    @Override
    public String toString() {
        String s = "";
        char c = 'a';
        for(int i = 0 ; i < ar1.size() ; i++){
            s += c + ": ";
            s += String.join(", ", ar1.get(i));
            s += "\n";
            c++;
        }
        return s;
    }

}
