package LinkedLists.Ex04;

import java.util.LinkedList;
import java.util.Random;

public class Bank {

    private LinkedList[] queue;

    Bank(int n) {
        queue = new LinkedList[n];
        for(int i = 0 ; i < n ; i++){
            queue[i] = new LinkedList<String>();
        }
    }

    public LinkedList[] getQueue() {
        return queue;
    }

    public void setQueue(LinkedList[] queue) {
        this.queue = queue;
    }

    public void customerEnters(String fullName){
        Random r = new Random();
        int cashier = r.nextInt(queue.length);
        queue[cashier].add(fullName);
    }

    public void customerServed() {
        Random r = new Random();
        while(true){
            if(isEmpty()){
                System.out.println("Bank is Empty!");
                break;
            }
            int cashier = r.nextInt(queue.length);
            if (!queue[cashier].isEmpty()){
                System.out.println(queue[cashier].remove() + " was served");
                break;
            }
        }
    }

    public boolean isEmpty() {
        boolean empty = true;
        for(int i = 0 ; i < queue.length ; i++){
            if(!queue[i].isEmpty()){
                empty = false;
                break;
            }
        }
        return empty;
    }

    @Override
    public String toString() {
        String s = "";
        for(int i = 0 ; i < queue.length ; i++){
            s += "Cashier Number " + (i+1) + ": ";
            s += queue[i].toString();
            s += "\n";
        }
        return s;
    }
}
