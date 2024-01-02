import java.util.*;
import student.Student;

public class Client{

public static void main(String[] args) {
System.out.println("This is the student client");
String name;
int age;
String address;
String email;

name  = args[0];
age = Integer.parseInt(args[1]);
address = args[2];
email = args[3];

Student student = new Student(name,age,address,email);
System.out.println("Returning values");

int studentAge;
String studentName;
studentAge = student.getAge();
studentName = student.getName();
System.out.format("New student name is %s, age is %d",studentName,studentAge);
}


}
