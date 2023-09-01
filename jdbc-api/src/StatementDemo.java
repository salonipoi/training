import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {
	public static void main(String[] args) {
		String sql = "insert into customer values(114,'Prakash','Shopping')";

		try {
			Connection conn = JdbcFactory.getConnection();
			// Getting statement object from connection to perform fixed query
			Statement stmt = conn.createStatement();
			// Performing DML Operation using statement
			stmt.executeUpdate(sql);
			// If everything goes fine, printing message
			System.out.println("Record inserted...");
		} catch (SQLException e) {
			System.out.println("Record not inserted, due to...");
			e.printStackTrace();
		}
	}
}
