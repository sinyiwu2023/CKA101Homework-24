package hw7.hw7Q04Q05;

import java.io.Serializable;

public class Dog extends Animal {
		
	public Dog(String name) {
		super(name);
	}
	
	public void speak() {
		System.out.println("This is Dog " + getName() + " speaking.");
	}
}
