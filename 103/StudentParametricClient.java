import java.util.*;
import student.Student;

public class Client{

public static void main(String[] args) {
System.out.println("This is the student client");
Set<String> supported_flags = Set.of("add_student","enroll");

String flag;
String name;
int age;
String address;
String email;

flag = args[0];
name  = args[1];
age = Integer.parseInt(args[2]);
address = args[3];
email = args[4];

if (!supported_flags.contains(flag)) {
System.out.format("WARNING - user asked for flag %s, supported_flags contains %s", 
flag,supported_flags);
}

switch(flag) {
case "add_student":
Student student = new Student(name,age,address,email);
System.out.println("Returning values");

int studentAge;
String studentName;
studentAge = student.getAge();
studentName = student.getName();
System.out.format("New student name is %s, age is %d",studentName,studentAge);
break;

case "enroll":
System.out.println("Doing nothing - for now");
break;
}

}

}
