package core.immutable.example;


/*
    Immutable class in java :
        1. Class will be final : no sub class can extend this class
        2. all data members will be final :  so that their values cannot be changed .
        3. only getter methods , no setter methods.
 */
public final class Book {

    final String name;

    Book(String _name){
        this.name =_name;
    }

    public String getName() {
        return name;
    }
}
