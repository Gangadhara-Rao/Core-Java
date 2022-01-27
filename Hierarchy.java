package gangadhar;
import java.util.Scanner;
class Employee{
	Scanner sc=new Scanner(System.in);
	int i=20000;
	public void details() {
		System.out.println("Salary of employee:"+i);
	}
}
class Manager extends Employee{
	Scanner sc=new Scanner(System.in);
	public void details() {
		System.out.print("Enter incentives:");
		int m=sc.nextInt();
		System.out.println("Total salary of Manager"+(super.i+m));
	}
}
class Labour extends Employee{
	Scanner sc=new Scanner(System.in);
	public void details() {
		System.out.print("Enter extra time labour in month:");
		int m=sc.nextInt();
		int x=super.i/12;
		int y=x*m;
		System.out.println("Total salary of labour"+(super.i+y));
	}
}
public class Hierarchy {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.details();
		Manager m=new Manager();
		m.details();
		Labour l=new Labour();
		l.details();

	}

}
