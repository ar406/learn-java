The goal here is to define a class and use its methods from another class ("client" class), **ensuring that objects with the same parameters are not being created multiple times**.

As in the previous examples (101,102,103), we are not simulating different classes on possibly different nodes (distributed system), so there is no web or application server here.
Instead, **packages** are used, with the assumption that all classes are stored on a shared filesystem on a single node.

**Main lessons**

One of the basic OOP principles is identity: two objects have distinct identities even if they belong to the same class and all attributes have the same values.

In some cases, this leads to waste of resources and potential consistency issues.

For example, calling a naif new Student(name,age,address,email) method with the same data twice creates two objects. This not only wastes disk/memory resources, but can also be misleading when it comes to deleting (am I deleting *all* instances of that student?).

We can solve this issue by **overriding the equals method**.

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


