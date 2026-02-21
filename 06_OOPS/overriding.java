package JAVA;

class Animal{
	void sound() {
		System.out.println("Animal sounds");
	}
}
class Dog extends Animal{
	@Override
	void sound() {
		System.out.println("Barks");
	}
}
class Cat extends Animal{
	@Override
	void sound() {
		System.out.println("Meow");
	}
}

public class overriding {

	public static void main(String[] args) {
		Cat obj = new Cat();
		Dog obj2 = new Dog();
		obj2.sound();
		obj.sound();
		

	}

}
