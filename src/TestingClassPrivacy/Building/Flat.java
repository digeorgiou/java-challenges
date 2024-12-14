package TestingClassPrivacy.Building;

//creating a class called Flat that represents each flat of the building
// it contains people.

public class Flat {
    private int people;

    //the construction initializes people living in the flat to 0
    Flat() {
        people = 0;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    // simple method adding n people in the flat
    public void addPeople(int n){
        this.people += n;
    }
}
