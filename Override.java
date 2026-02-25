package spring;

class Animal {
	public void eat() {
		System.out.println("Animal Class");
	}
}

class Dog extends Animal{
	public void eat() {
		System.out.println("Dog Class");
	}
	public void bark() {
		System.out.println("Dog Bark");
	}
}

class Cat extends Animal{
	public void eat() {
		System.out.println("Cat Class");
	}
	public void meow() {
		System.out.println("Cat Meow");
	}
}

public class Override {
	public static void main(String[] args) {
		Animal arr[] = {new Animal(), new Dog(), new Cat()};
		for(Animal obj:arr) {
			obj.eat();
			if(obj instanceof Dog)
				((Dog)obj).bark();
			if(obj instanceof Cat)
				((Cat)obj).meow();
		}
	}
}
