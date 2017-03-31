package com.company.collections.sorting;

import java.util.Arrays;
/*
 * In order for me to compare Person[0].age with Person[1].age I have to implement the 
Persons class from the Comparable  interface and override 
the 'int compareTo(Object)' method.

The compareTo method returns zero if the object passed is equal to this instance. 
It returns a positive integer or a negative integer if this object is greater or 
smaller than the passed object, respectively.
 */

public class Main1 {

  public static void main(String[] args) {
    Person[] persons = new Person[4];
    
    persons[0] = new Person();
    persons[0].setFirstName("Elvis");
    persons[0].setLastName("Goodyear");
    persons[0].setAge(56);

    persons[1] = new Person();
    persons[1].setFirstName("Stanley");
    persons[1].setLastName("Clark");
    persons[1].setAge(8);

    persons[2] = new Person();
    persons[2].setFirstName("Jane");
    persons[2].setLastName("Graff");
    persons[2].setAge(16);

    persons[3] = new Person();
    persons[3].setFirstName("Nancy");
    persons[3].setLastName("Goodyear");
    persons[3].setAge(69);

    System.out.println("Natural Order");

    for (int i=0; i<4; i++) {
      Person person = persons[i];
      System.out.println(person.getLastName() + ", " + person.getFirstName() + ". Age:" + person.getAge());
    }

    Arrays.sort(persons);

    System.out.println();
    System.out.println("Sorted by age");

    for (int i=0; i<4; i++) {
      Person person = persons[i];
      System.out.println(person.getLastName() + ", " + person.getFirstName() + ". Age:" + person.getAge());
    }
  }
}