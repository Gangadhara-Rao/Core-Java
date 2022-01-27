package gangadhar;

class Person{
	private void eat()
	{
		System.out.println("person eats");
	}
}
class Dog extends Person
{
	public void bark()
	{
		System.out.println("Dogs barks");
	}
}
public class Singletone {

	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.bark();
		//d1.eat();

	}

}
