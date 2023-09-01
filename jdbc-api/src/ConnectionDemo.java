
// we have to use factory because we need a new connection each time and connection cannot be reused
import java.sql.Connection;
import java.sql.DatabaseMetaData;

public class ConnectionDemo {

	public static void main(String[] args) throws Exception {

		Connection conn = JdbcFactory.getConnection();
		System.out.println("Connection Successful!!");

		DatabaseMetaData meta = conn.getMetaData();
		System.out.println("DB Name: " + meta.getDatabaseProductName());
		System.out.println("DB Ver: " + meta.getDatabaseProductVersion());
		System.out.println("Driver Name: " + meta.getDriverName());
		System.out.println("Driver Ver: " + meta.getDriverVersion());

	}
}
