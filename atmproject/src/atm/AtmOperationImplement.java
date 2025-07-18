package atm;
import java.util.*;
public class AtmOperationImplement implements AtmInterface {

Atm atm=new Atm();
Map<Double,String> ministmt=new HashMap<>();
	public void viewBalance() {
		System.out.println("AvailableBalance"+atm.getBalance()); 
		
	}

	 
	public void withdrawAmount(double withdrawAmount) {
 		if(withdrawAmount%500==0) {
 			if(withdrawAmount<=atm.getBalance()) {
 				System.out.println("collect the cash"+withdrawAmount);
 				atm.setBalance( atm.getBalance()-withdrawAmount);
 				ministmt.put(withdrawAmount,"amount withdrawn");
 				viewBalance();
 			}
 			else {
 				System.out.println("insufficent balance");
 			}
 		}
 		else {
 			System.out.println("enter thr amount terms of 500");
 		}
	}

	 
	public void depositAmount(double depositAmount) {
 		System.out.println("depositedAmount is:"+depositAmount);
	atm.setBalance(atm.getBalance()+depositAmount);
	ministmt.put(depositAmount,"Deposited successfully");
	viewBalance();
	}

	 
	public void viewMinistatement() {
 		Set<Double> set=ministmt.keySet();
 		for(double d:set) {
 			System.out.println(d+"="+ministmt.get(d));
 		}
	}

}
