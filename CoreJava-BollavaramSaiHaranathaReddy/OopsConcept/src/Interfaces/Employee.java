package Interfaces;

public class Employee extends Person implements Player,Artist{

	public void doArt() {
		System.out.println("Artist");
	}
	
	public void doPlay() {
		System.out.println("Playing");
	}
	
	public void doWell() {
		System.out.println("a person does his work");
	}
}
