# Java-Assignment-010 - Classes and Objects

## Part 1 - Analyze
* Add Comments to the Code below and label the following:
  1. Class name
  2. All **instance variables/fields** and their data-types
  3. The **Constructor** and the **Constructor Parameters**
  4. Where a **Student** object gets created.
  5. Where the **instance variables** value gets set and what its values are.
  6. All the instance methods for the class **Student**

```java
//Create a class named Student. It contains a method named methodForDisplay(); of type void for displaying the name and roll number of the student. It also contains a main method.
class Student{
    //Our private instance variables for the name and roll number of the student. Name is of type String and rollNo is of type int.
    private String name;
    private int rollNo;
   
    //Create our class constructor that takes two parameters, a string and an integer.
    Student(String s, int r)
    {
        //
   	    name = s;
   	    rollNo = r;
    }
    // Create our method that displays the students name and roll number.
    void methodForDisplay()
    {
        System.out.println(name+"'s Roll No: "+rollNo);
    }

    public static void main(String[] args) {
        //Create our student object, and pass in the string "Rambo" as the name and integer 21 as the int parameters.
        Student obj1=new Student("Rambo",21);
        obj1.methodForDisplay();
    }
}
```

## Part 2 - Public VS Static
* Read the W3Schools page on class methods: [W3Schools Java Class Methods](https://www.w3schools.com/java/java_class_methods.asp)
* In your own words, write a few sentences below explaining the difference between static and public methods in relation to a class.

* Static methods are accessible without the need for creating an object of the class such as Main myObj = new Main();
* Though if you create a public method then you will need to create an object of the class first and then call the method on the object in your main method.

## Part 3 - Dogs
* View the image below, and from the image, construct a Java file **Dog** that mirrors the diagrammed class and the 3 dog objects.
![Dog Class](images/ClassVSObject.png)
* Your class should be named **Dog**
* You should have **private** instance variables/fields for all the data members.
* You should have a **constructor** that sets the initial state of the data members via passed parameters.
    * Think about what data-types the fields and parameters will need!!!
* You should have 4 instance methods for eat, run, sleep, and name
* You should have a **main** method that creates the 3 Dog objects in the diagram.
* Make at least 2 of your methods functional (i.e. perform some action)!!!
    * For Example: method eat might take a class parameter named **Sleep** (i.e. another class) that has a field **weight**, and your eat method might reduce the weight in **Sleep**.

## Part 4 - Turn-In
* Commit your code and push it back to your account.
* Create a Pull request as you have been doing for all assignments.
* Paste the Pull request URL back into the Canvass assignment page for credit.