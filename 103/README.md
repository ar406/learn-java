The goal here is to define a class and use its methods from another class ("client" class), **specifying its arguments from the command line**.

As in 101 and 102, we are not simulating different classes on possibly different nodes (distributed system), so there is no web or application server here.
Instead, **packages** are used, with the assumption that all classes are stored on a shared filesystem on a single node.

**Main lessons**

To support a specific set of flags (command-line arguments), define the set of supported flags in a Set and use .contains to ensure the user-provided flag is supported.
Note that sets of strings can be directly printed by System.out.format using %s (which means string).


**Instructions**

First, install the JDK

CentOS/Fedora/RHEL: dnf install java-11-openjdk-devel -y

Save the files somewhere

Create a Student package, by compiling class files which refer to the same package: javac -d . Student.java

Call the client: /usr/lib/jvm/java-11-openjdk/bin/java StudentClient.java

    [user@machine ~]$ /usr/lib/jvm/java-11-openjdk/bin/java StudentParametricClient.java "add_student" "John Doe" 12 "19 martin luther king street, los angeles" "aa@example.local"
    This is the student client
    Returning values
    New student name is John Doe, age is 12 

When using the "enroll" flag, the application returns a custom message:

Finally, if the user selects an unsupported flag, the application returns an error and terminates:


