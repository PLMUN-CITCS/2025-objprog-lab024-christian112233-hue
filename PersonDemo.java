class Person {
    String name;
    int age;

    // Constructor with parameters
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Default constructor
    Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Bob", 30);
        Person person2 = new Person();

        person1.display();
        person2.display();
    }
}
