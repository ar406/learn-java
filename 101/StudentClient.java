import java.util.*;
import student.Student;

public class Client{


public static void main(String[] args) {
System.out.println("This is the student client");
Student student = new Student("Mark",30,"Washington Street, 10043, NY","mark@example.local");
student.setAge(30);
student.setName("Mark");
student.setAddress("Washington Street, 10043, NY");
student.setEmail("mark@example.local");
System.out.println("Returning values");

int studentAge;
String studentName;
studentAge = student.getAge();
studentName = student.getName();
System.out.format("New student name is %s, age is %d",studentName,studentAge);
}


}
