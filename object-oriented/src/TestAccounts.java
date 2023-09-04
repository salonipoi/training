import com.ey.bank.AccountsFactory;
import com.ey.bank.BalanceException;
import com.ey.bank.Bank;
import com.ey.bank.Current;

public class TestAccounts {

	public static void main(String[] args) {
//		// Accounts a1 = new Accounts("Polo", 5000);
//		// Savings s1 = new Savings("Polo");
//		/**
//		 * a1.summary();
//		 * 
//		 * a1.deposit(1000); a1.summary();
//		 * 
//		 * a1.withdraw(3000); a1.summary();
//		 * 
//		 * a1.withdraw(4000);
//		 */
//		/**
//		 * s1.summary(); s1.withdraw(1); s1.deposit(100); s1.summary();
//		 */
//		AccountsFactory factory = new AccountsFactory();
//		
//		Bank c1 = factory.createCurrentAccount("Sam");
//		c1.summary();
//		Bank s1 = factory.createSavingsAccount("Ben");
//		s1.summary();
//	/*	
//		Bank c1 = new Current("Saloni");
//		c1.summary();
//		c1.withdraw(3000);
//		c1.withdraw(2000);
//		c1.summary();
//		c1.deposit(3000);
//		c1.deposit(2000);
//		c1.summary();
//*/
		Bank s1 = AccountsFactory.createSavingsAccount("Ben");
		try {
			s1.withdraw(10);
		} catch (BalanceException e) {// study 2 string method
			// e.printStackTrace();//dEVELPOERS: Troubleshoot the issues
			// System.out.println(e);// Logging:To audit system behaviour
			System.out.println(e.getMessage());// Endusers
		}
	}
}
