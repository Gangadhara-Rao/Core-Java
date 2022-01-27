package gangadhar;

import java.util.Scanner;

public class Persist {
	public static void main(String[] args) {
		Persistence p = new DatabasePersistence();
		p.persist();
		
	}

}
abstract class Persistence{
	abstract void persist();
}
class FilePersistence extends Persistence{
	Scanner input = new Scanner(System.in);
	int i;
	void persist() {
		i = input.nextInt();
		
	}
}
class DatabasePersistence extends Persistence{
	Scanner input = new Scanner(System.in);
	int j;
	void persist() {
		j = input.nextInt();
		System.out.println("Persist invoked.");
	}
}
