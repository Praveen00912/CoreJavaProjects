package com.javastudentmanagementrecord;

import java.io.*;
import java.util.*;

class Student implements Serializable {
    int id;
    String name;
    double marks;
    transient String password;

    public Student(int id, String name, double marks, String password) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.password = password;
    }

    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', marks=" + marks + ","
        		+ " password=" + password + "}";
    }
}

public class StudentRecordSystem {

    public static void main(String[] args) {

        try {
            FileWriter f = new FileWriter("students.txt");
            BufferedWriter b = new BufferedWriter(f);

            b.write("101,John,85.5");
            b.write("\n102,Ravi,90.0");
            b.write("\n103,Anu,88.0\n");

            b.close();
            System.out.println("Data written to students.txt\n");

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Reading from students.txt:");
        try {
            BufferedReader br = new BufferedReader(new FileReader("students.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            PrintWriter pw = new PrintWriter("output.txt");

            pw.println("STUDENT REPORT");
            pw.println("--------------");

            pw.println("101 John 85.5");
            pw.println("102 Ravi 90.0");
            pw.println("103 Anu 88.0");

            pw.close();
            System.out.println("\nFormatted data written to output.txt");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "John", 85.5, "pass123"));
        students.add(new Student(102, "Ravi", 90.0, "pass456"));
        students.add(new Student(103, "Anu", 88.0, "pass789"));

        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream("students.ser")));

            oos.writeObject(students);
            oos.close();

            System.out.println("\nStudents serialized to students.ser");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream ois = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream("students.ser")));

            List<Student> list = (List<Student>) ois.readObject();
            ois.close();

            System.out.println("\nDeserialized Student Objects:");
            for (Student s : list) {
                System.out.println(s);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}