package com.rapiddelivery.example;

public record Person(String firstName, String secondName, int age) {
    //     Compact canonical constructor
   /*public Person {
        if (age < 18){
            throw new IllegalArgumentException("You cannot drink alcohol");
        }
    }*/

    /* Verbose canonical constructor
    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }
    */

   /* public Person(){
        this("John", "Smith", 43);
    }*/
}
