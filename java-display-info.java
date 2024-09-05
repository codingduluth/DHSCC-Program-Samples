// Java Program: Basic Class and Object

class Person {
    // Instance variables
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Create an object of the Person class
        Person person1 = new Person("Alice", 25);

        // Call the displayInfo method to show the person's information
        person1.displayInfo();
    }
}