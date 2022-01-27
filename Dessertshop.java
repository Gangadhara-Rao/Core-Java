package gangadhar;

import java.util.Scanner;

public class Dessertshop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Are you a user or owner: ");
		String str = input.nextLine();
		str = str.toUpperCase();
		if(str.matches("OWNER")) {
			System.out.println("Please add an iteam: ");
			String str1 = input.next();
			str1 = str1.toUpperCase();
			switch(str1)
			{
			case "CANDY":
				Dessertitem c = new Candy();
				c.insert();
				break;
			case "COOKIE":
				Dessertitem c1 = new Cookie();
				c1.insert();
				break;
			case "IceCream":
				Dessertitem i = new IceCream();
				i.insert();
				
			}
				
		}
		else if(str.matches("USER")) {
			System.out.print("Please place your order: ");
			String name = input.nextLine();
			name = name.toUpperCase();
			switch(name)
			{
			case "CANDY":
				Dessertitem d = new Candy();
				System.out.print("Place the quantity of candy: ");
				int n = input.nextInt();
				System.out.print("This is your bill amount in rupees: "+d.getCost(n));
				break;
			case "COOKIE":
				Dessertitem e = new Cookie();
				System.out.print("Place the quantity of cookie: ");
				int m = input.nextInt();
				System.out.print("This is your bill amount in rupees: "+e.getCost(m));
				break;
			case "IceCream":
				Dessertitem f = new IceCream();
				System.out.print("Place the quantity of Icecream: ");
				int o = input.nextInt();
				System.out.print("This is your bill amount in rupees: "+f.getCost(o));
				break;
			}
		}
		
	}

}
abstract class Dessertitem{
	public abstract void insert();
	public abstract double getCost(int x);
}
class Candy extends Dessertitem{
	
	public double getCost(int x) {
		// TODO Auto-generated method stub
		double i = x*60;
		return i;
	}

	@Override
	public void insert() {
		System.out.println("Thank you for inserting candy");
	}
}
class Cookie extends Dessertitem{
	public double getCost(int x) {
		double i = x*70;
		return i;
	}

	@Override
	public void insert() {
		System.out.println("Thank you for adding cookie");
	}
}
class IceCream extends Dessertitem{
	public double getCost(int x) {
		return x;
	}

	@Override
	public void insert() {
		System.out.println("Thank you for adding IceCream");
	}
}