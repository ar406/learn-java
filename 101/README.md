The goal here is to define a class and use its methods from another class ("client" class).

We are not simulating different classes on possibly different nodes (distributed system), so there is no web or application server here.
Instead, **packages** are used, with the assumption that all classes are stored on a shared filesystem on a single node.

**Main lessons**

The main() method is **required** for compilation.

Constructor and main methods have different purposes:

- constructor methods aim at creating new objects
- the main() method acts as a potential entry point

Remember that Java is a statically typed languages, so you need to declare variables before using them (int Age, String Name,...).
Failure to do so will result in "cannot find symbol" errors at compile time.

**Instructions**

First, install the JDK

CentOS/Fedora/RHEL: dnf install java-11-openjdk-devel -y

Save the files somewhere

Create a Student package, by compiling class files which refer to the same package: javac -d . Student.java

Call the client: /usr/lib/jvm/java-11-openjdk/bin/java StudentClient.java

    [user@machine ~]$ /usr/lib/jvm/java-11-openjdk/bin/java StudentClient.java 
    This is the student client
    Returning values
    New student name is Mark, age is 30 
