package student;
import java.util.*;

public class Student {
private String name;
private int age;
private String address;
private String email;

//constructor taking all parameters

public Student(){}

public Student(String name, int age, String address, String email) {
this.name = name;
this.age = age;
this.address = address;
this.email = email;
}


//individuals getters and setters
public void setName(String inputName) {
name = inputName;
}

public void setAge(int inputAge) {
age = inputAge;
}

public void setAddress (String inputAddress) {
address = inputAddress;
}

public void setEmail (String inputEmail) {
email = inputEmail;
}

public String getName() {
return name;
}

public int getAge() {
return age;
}

public String getAddress() {
return address;
}

public String getEmail() {
return email;
}

//main method is necessary for compilation

public static void main(String[] args) {
System.out.println("Hello world");
}

}
