// Creating a new java class with the name of Smartphonejava 

//Syntax of Smartphone.java

package org.studyeasy;

public class Smartphone {

    private String brand = "Apple";

    // here we have not generated a constructor then java will use their rule

    // let add generate a constructor here

    public Smartphone(String brand) {
        this.brand = brand;
    } // it is known as a parameterized constructor

    // adding getter
    public String getBrand() {
        return brand;
    }
}


// Note :-- Java runs on a rule " Either You Do It Or I Do It



// if we don't use the default constructor, The constructor which we have generated
// it is known as parameterized constructor


// Syntax for the Main.java 

package org.studyeasy;

public class Main {
    public static void main(String[] args) {

        // Default construct in Java

        Smartphone phone = new Smartphone("Samsung"); // here Smartphone() is method or a constructor




        System.out.println(phone.getBrand());

    }
}

// O/p     Samsung



// So if we don't generate the constructor in Smartphone.java , Then the java will by default create a constructor for him......as per their rule
