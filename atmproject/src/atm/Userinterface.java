package atm;
import java.util.*;
public class Userinterface {
private static int status;
	public static void main(String[] args) {
		AtmOperationImplement imp1=new AtmOperationImplement();
		Scanner sc=new Scanner(System.in);
		int atmnumber=123456;
		int atmpin=123;
		System.out.println("WELCOME TO THE ATM MACHINE");
		System.out.println("ENTER THE ATM NUMBER");
		int atmnum2=sc.nextInt();
		System.out.println("ENETR THE PIN");
		int atmpin2=sc.nextInt();
		if(atmnumber==atmnum2&&atmpin==atmpin2) {
			while(true) {
			System.out.println(" 1.viewAvalable\n 2.withdrawAmount\n 3.DepositAmount\n 4.viewMinistmt\n 5.exit");
			System.out.println("ENTER THE CHOIC:");
			int ch=sc.nextInt();
			if(ch==1) {
				imp1.viewBalance();
			}
			else if(ch==2) {
				System.out.println("ENTER THE AMOUNT TO WITHDRAW");
				double withdrawamount=sc.nextDouble();
				imp1.withdrawAmount(withdrawamount);
			}
			else if(ch==3) {
				System.out.println("ENTER THE AMOUNT TO DEPOSIT");
				double depositamount=sc.nextDouble();
				imp1.depositAmount(depositamount);
			}
			else if(ch==4) {
				imp1.viewMinistatement();
			}
			else if(ch==5) {
			System.out.println("COLLECT YOUR ATM CARD \n THANK YOU");
System.exit(status);
			}
		}
		}
		else {
			System.out.println("IN CORRECT ATM NUMBER OR PIN");
		}
		sc.close();

	}

}
