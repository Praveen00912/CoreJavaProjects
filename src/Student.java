/* Create an encapsulated Student class with the following attrinutes:
1. name
2. age

create parameterized constructor and no argument constructor.abstract

create Accessors and Mutators

Create the object of Students

Validate the age of the student:
*/

public class Student {
    private String name;
    private int age;

    public Student() {
        this.name = "Unknown";
        this.age = 0;
    }

    public Student(String name, int age) {
        this.name = name;
        boolean valid= true;
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age " + age );
            valid=false;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
    }
}