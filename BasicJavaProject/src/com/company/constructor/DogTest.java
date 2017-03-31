package com.company.constructor;

public class DogTest {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.setName("Tommy");
		dog.setAge(5);
		dog.printDetails();
		System.out.println(dog.getName());
		System.out.println();

		Dog dog3 = new Dog("Puppy");
		dog3.setAge(3);
		dog3.printDetails();
		
		Dog dog4 = new Dog("Ruby", 2);
//		dog4.setAge(6);
		dog4.printDetails();
		
		Cat cat1 = new Cat();
		cat1.setName("Billy");
		cat1.setAge(8);
		cat1.printMe();
		
		
	}

}
