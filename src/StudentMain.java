public class StudentMain {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Sai");
        s1.setAge(20);
        Student s2 = new Student("Swaroop",15 );
        s1.displayDetails();
        s2.displayDetails();
    }
}