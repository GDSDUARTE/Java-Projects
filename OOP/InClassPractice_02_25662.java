package OOP;
/*
* CA2: Object-Oriented Programming
* Name: Guilherme Duarte da Silva
* ID: 25662
*
* Task:
* Write a program that will write the details of the students and the teachers in a file (collegeDatabase).
*/

import java.io.*;

class Person {
    String name;
    String address;
    String phoneNumber;
    String emailAddress;

    void Details(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String toString() {
        return "Person: name = " + name + ", address = " + address + ", phoneNumber = " + phoneNumber + ", emailAddress = "
                + emailAddress + ".";
    }
}

class Student extends Person {
    String id;

    void Details(String id) {
        super.Details(name, address, phoneNumber, emailAddress);
        this.id = id;
    }

    public Student() {
    }

    public String toString() {
        return "Student: \nName = " + name + "\nId = " + id + "\nAddress = " + address + "\nPhoneNumber = " + phoneNumber + "\nEmailAddress = "
                + emailAddress + ".";
    }
}

class Teacher extends Person {
    String office;
    int salary;
    String dateHired;

    void Details(String office, int salary, String dateHired) {
        super.Details(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public Teacher() {
    }

    public String toString() {
        return "Teacher: \nName = " + name + "\nOffice = " + office + "\nSalary = " + salary + "\nDateHired = " + dateHired + "\nAddress = " + address + "\nPhoneNumber = " + phoneNumber + "\nEmailAddress = "
                + emailAddress + ".";
    }
}

public class InClassPractice_02_25662 {
    public static void main(String[] args) {
        File f = new File("collegeDatabase.txt");
        
        Student student = new Student();
        student.name = "Guilherme Duarte da Silva";
        student.address = "Coolock Dublin 17";
        student.phoneNumber = "123456789";
        student.emailAddress = "25662@student.dorset-college.ie";
        student.id = "25662";

        Teacher teacher = new Teacher();
        teacher.name = "Wei Ren";
        teacher.address = "Dorset College";
        teacher.phoneNumber = "123456789";
        teacher.emailAddress = "12345@teacher.dorset-college.ie";
        teacher.office = "Programming";
        teacher.salary = 20000;
        teacher.dateHired = "01/01/2022";

        System.out.println(student.toString());
        System.out.println(teacher.toString());

        try {
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(student.toString());
            bw.newLine();
            bw.newLine();
            bw.write(teacher.toString());
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

}





