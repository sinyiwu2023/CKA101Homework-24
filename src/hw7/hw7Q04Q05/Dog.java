package hw7.hw7Q04Q05;

import java.io.Serializable;

public class Dog implements Speakable, Serializable {
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
