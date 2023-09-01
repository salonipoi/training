
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedDemoWithScanner {
	public static void main(String[] args) {
		// ? is known as place holders, their index starts from 1
		String sql = "insert into customer values(?,?,?)";

		try {
			Connection conn = JdbcFactory.getConnection();
			// Pre=compile statement created with query

			PreparedStatement stmt = conn.prepareStatement(sql);
			Scanner console = new Scanner(System.in);
			System.out.println("Enter the 3 arguments:");
			// Replacing place holders with values
			stmt.setInt(1, console.nextInt());
			stmt.setString(2, console.next());
			stmt.setString(3, console.next());

			stmt.executeUpdate();
			System.out.println("Record successfully inserted...");
		} catch (SQLException e) {
			System.out.println("Insertion failed due to..");
			e.printStackTrace();
		}
	}

}