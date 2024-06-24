package PropertiesOOP;

public class Polymorphism {

class Animal {
public void makeSound() {

System.out.println("The animal makes a sound");

}

}

class Dog extends Animal {

@Override

public void makeSound() {

System.out.println("The dog barks");

super.makeSound();

}

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
