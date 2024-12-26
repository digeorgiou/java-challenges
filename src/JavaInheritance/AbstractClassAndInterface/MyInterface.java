package JavaInheritance.AbstractClassAndInterface;

interface MyInterface{
    int fx = 0; // static constant (this is the only kind of variable i can
    // have in an interface)
    default void iff() {} //method, i need to  write default before,
    // otherwise it is an abstract method;
    static void ig() {} // static method
    void ih(); //abstract method
}