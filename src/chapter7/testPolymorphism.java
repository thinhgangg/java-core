package chapter7;

class Animal {
	void eat() {
		System.out.println("animal is eating...");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("dog is eating...");
	}
}

class BabyDog extends Dog {

}

public class testPolymorphism {
	public static void main(String[] args) {
		Animal animal = new BabyDog();
		animal.eat();
	}
}
