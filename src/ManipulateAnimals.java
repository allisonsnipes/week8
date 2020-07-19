/*
 * Allison Snipes
 * Course 605.201.81 Summer 2020
 * Assignment 8 Question 1
 * 
 *  Project Specs:
 *  Develop a program called ManipulateAnimals that does the following: An Animal class will be used to
 *  model some basic characteristics of animals for the application. An animal will have a name attribute 
 *  and methods to set the name and get the name. Animals can make sounds and are drawable, rotatable, and 
 *  resizable. A Vehicle class will be used to model some basic characteristics of vehicles. A vehicle 
 *  will have a name and an age, and methods to get/set these attributes. Vehicles can also make sounds 
 *  and are drawable, rotatable, and resizable. Create a collection of 2 vehicles and 2 animals stored in 
 *  the same array. Loop through the array and execute the drawObject(), rotateObject(), resizeObject(), 
 *  and playSound() methods polymorphically for each element in the array. The drawObject() method should 
 *  simply display the message “Drawing a Vehicle” or “Drawing an Animal”; the rotateObject() method should
 *  display the message “Rotating a Vehicle” or “Rotating an Animal”; and the playSound() method should 
 *  display the message “Animal sound” or “Vehicle sound”, depending upon the type of element that is in the
 *  array. The resizeObject() method should display “Resizing a Vehicle” or “Resizing an Animal”.

/*
 * Here I will set up the main class here which will have the required elements that will create the 2
 * objects of each type (animal and vehicle). This is where the whole project comes together with the
 * interfaces and abstract classes.
 */

public class ManipulateAnimals {
	
	public static void main(String[] args) {
		headerMsg();
		
		createdObj[]objects = {new Vehicle("Tesla", 3), new Vehicle("Rivian", 2), new Animal("Puma"), new Animal("Sealion")};
		
		//loop through all the elements in the object to be able to make sounds, draw, rotate, and resize
		for(createdObj obj: objects) {
			obj.sound();
			obj.draw();
			obj.rotate();
			obj.resize();
		}
	}
	
	public static void headerMsg() {
		System.out.println("\n");
		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println("|                                   Welcome User,                              |");
		System.out.println("|          This application will demonstrate the skills, methods, and topics   |");
		System.out.println("|   discussed pertaining to abstract classes and interfaces. This exercise     |");
		System.out.println("|   teaches us how to create reusable code for other application and projects  |");
		System.out.println("|                               to use. Let's start!                           |");
		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println("\n");
	}

}


/*
 * Here I will set up the abstract class
 */

abstract class createdObj implements Sound, Draw, Rotate, Resize {
	
}

/*
 * Here I will set up all the needed interfaces for Sound, Draw, Rotate, Resize
 */
interface Sound {
	void sound();
}

interface Draw {
	void  draw();
}

interface Rotate {
	void rotate();
}

interface Resize {
	void resize();
}


/*
 * Here I will create the class for Animals
 */

class Animal extends createdObj {
	private String nameAttrb;
	
	//getter
	public String getNameAttrb() {
		return nameAttrb;
	}
	
	//setter
	public void setNameAttrb(String nameAttrb) {
		this.nameAttrb =  nameAttrb;
	}
	
	//instantiation
	public Animal(String nameAttrb) {
		this.nameAttrb = nameAttrb;
	}
	
	//utilize all of the interfaces for the object
	public void sound() {
		System.out.println("Animal sound.");
	}
	
	public void draw() {
		System.out.println("Drawing animal.");
	}
	
	public void rotate() {
		System.out.println("Rotate animal.");
	}
	
	public void resize() {
		System.out.println("Resizing animal.");
	}
}

/*
 * Here I will create the class for Vehicles
 */

class Vehicle extends createdObj {
	private String nameAttrb;
	private int age;
	
	//getter for name
	public String getNameAttrb() {
		return nameAttrb;
	}
	
	//setter for name
	public void setNameAttrb(String nameAttrb) {
		this.nameAttrb = nameAttrb;
	}
	
	//getter for age
	public int age() {
		return age;
	}
	
	//setter for age
	public void age (int age) {
		this.age = age;
	}
	
	//instantiation
	public Vehicle(String nameAttrb, int age) {
		this.nameAttrb = nameAttrb;
		this.age = age;
	}
	
	//utilize all of the interfaces for the object
	public void sound() {
		System.out.println("Vehicle sound.");
	}
	
	public void draw() {
		System.out.println("Drawing vehicle.");
	}
	
	public void rotate() {
		System.out.println("Rotate vehicle.");
	}
	
	public void resize() {
		System.out.println("Resizing vehicle.");
	}
}