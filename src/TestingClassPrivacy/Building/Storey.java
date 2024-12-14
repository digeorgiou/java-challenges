package TestingClassPrivacy.Building;

//creating a class called Storey that contains an array of flats.

public class Storey {
    private Flat[] cFlat;

    // the constructor of Storey initializes the number of flats in this
    // storey at c.

    Storey(int c) {
        cFlat = new Flat[c];
        for (int i = 0 ; i < c ; i++){
            cFlat[i] = new Flat();
        }
    }

    public Flat[] getcFlat() {
        return cFlat;
    }



//method taking 2 parameters. one specifies in which flat, and the other how
    //many people to add. it uses the addPeople method of the Flat class.

    public void addPeople(int flat, int people){
        this.cFlat[flat].addPeople(people);
    }
}
