package TestingClassPrivacy.Building;

// creating a class called building that contains an array
//of Storeys. Each storey contains flats, and each flat contains people.

import java.util.Random;

public class Building {
    private Storey[] cStorey;

//the constructor of this class initializes the number of storeys of this
// building at c, and the number of flats in each storey at n

    Building(int c , int n) {
        cStorey = new Storey[c];
        for (int i = 0 ; i < cStorey.length ; i++){
            cStorey[i] = new Storey(n);
        }
    }

    public Storey[] getcStorey() {
        return cStorey;
    }

    //method taking 3 parameters. one specifies which storey, in which flat,
    //and how many people to add. it uses the addPeople method of the Flat
    // class.
    public void addPeople(int storey, int flat, int people){
        this.cStorey[storey].addPeople(flat,people);
    }

    //simple method printing how many people are in each flat of each storey
    //of the building.
    public void printPeople() {
        int i =0;
        int j = 1;
        for(Storey st : cStorey){
            System.out.println("Storey: " + i + ":");
            for(Flat fl : st.getcFlat()){
                System.out.println(" Flat: " + j + " has " + fl.getPeople() + " people" );
                j+=1;
            }
            j = 1;
            i+=1;
        }
    }


    //a method using Random class to insert a random number of
    // people between 1 and 5.
    // in each flat of each storey in the building.

    public void randomizePeople() {
        Random ran = new Random();

        for (int i = 0 ; i < this.cStorey.length ; i++){
            //using get cflat because cFlat is private.
            for(int j = 0 ; j < this.cStorey[i].getcFlat().length ; j++ ){
                this.addPeople(i,j,ran.nextInt(1,5));
            }
        }

    }

}
