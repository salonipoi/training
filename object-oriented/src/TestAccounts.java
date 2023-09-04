import com.ey.bank.AccountsFactory;
import com.ey.bank.BalanceException;
import com.ey.bank.Bank;
import com.ey.bank.Current;

public class TestAccounts {

	public static void main(String[] args) {
		Bank s1 = AccountsFactory.createSavingsAccount("Ben");
		s1.deposit(3000);
		try {
			s1.withdraw(1000);
		} catch (BalanceException e) {
			e.printStackTrace();
		}
		s1.deposit(5000);
		try {
			s1.withdraw(4000);
		} catch (BalanceException e) {
			e.printStackTrace();
		}
		s1.statement();

	}
}
