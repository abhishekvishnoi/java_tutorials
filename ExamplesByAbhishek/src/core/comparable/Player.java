package core.comparable;

public class Player implements  Comparable <Player>{

    private int ranking;

    private String name;

    private int age;

    public Player(int ranking, String name, int age) {
        this.ranking = ranking;
        this.name = name;
        this.age = age;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Player o) {
        return Integer.compare(getRanking() , o.getRanking());

        //The sorting order is decided by the return value of the compareTo() method.
        // The Integer.compare(x, y)
        // returns -1 if x is less than y,
        // 0 if they're equal,
        // and 1 otherwise.

    }

    // constructor, getters, setters
}