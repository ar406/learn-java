The goal here is to define a class and use its methods from another class ("client" class), **specifying its arguments from the command line**.

As in 101, we are not simulating different classes on possibly different nodes (distributed system), so there is no web or application server here.
Instead, **packages** are used, with the assumption that all classes are stored on a shared filesystem on a single node.

**Main lessons**

A Java class can be invoked via CLI passing its arguments separated by spaces: 

    /usr/lib/jvm/java-11-openjdk/bin/java StudentParametricClient.java "John Doe" 12 "19 Marthin Luther King street, Los Angeles" "aa@example.local"

By default, data extracted from an array (e.g. arr[0]) are treated as strings. Therefore, if you need to get a non-string element (int,double,...) you need to use an appropriate conversion method.

String to int: Integer.parseInt(arr[0])

**Instructions**

First, install the JDK

CentOS/Fedora/RHEL: dnf install java-11-openjdk-devel -y

Save the files somewhere

Create a Student package, by compiling class files which refer to the same package: javac -d . Student.java

Call the client: /usr/lib/jvm/java-11-openjdk/bin/java StudentClient.java

    [user@machine ~]$ /usr/lib/jvm/java-11-openjdk/bin/java StudentParametricClient.java "John Doe" 12 "19 martin luther king street, los angeles" "aa@example.local"
    This is the student client
    Returning values
    New student name is John Doe, age is 12 

