

public class Person {
    public String name;
    private int id;
    private static int nextId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Person.nextId = nextId;
    }

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }


    public Person(String name){
        this.name = name;
    }

}
