

// BaseClass.java

public class BaseClass {
    // Fields, constructors, and methods common to all classes can be defined here
    private int id;
    private String name;

    // Constructor
    public BaseClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter and setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Example method
    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
    public void blah() {int a = 0;}
}
