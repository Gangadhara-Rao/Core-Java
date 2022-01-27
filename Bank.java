package gangadhar;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Fixed x = new Fixed();
		x.fixedAccount();
		int num1 = x.f;
		Current y = new Current();
		y.currentAccount();
		int num2 = y.c;
		totalCash(num1,num2);
		
	}

	public static void totalCash(int num1, int num2) {
		// TODO Auto-generated method stub
		int sum = num1+ num2;
		System.out.println("Total cash in the bank is: "+sum);
		
	}

}
class Fixed{
	int f;
	Scanner input = new Scanner(System.in);
	int fixedAccount() {
		System.out.print("Total fixed amount in the bank: ");
		f = input.nextInt();
		return f;
	}
}
class Current{
	int c;
	Scanner input = new Scanner(System.in);
	int currentAccount() {
		System.out.print("Total current amount in the bank: ");
		c = input.nextInt();
		return c;
	}
}