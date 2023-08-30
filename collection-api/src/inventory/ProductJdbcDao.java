package inventory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class ProductJdbcDao {
	public ProductJdbcDao() {
	}

	public void add(Product p) {

		String sql = "insert into product values(?,?,?)";

		try {
			Connection conn = JdbcFactory.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			// Replace place holders with values from p object
			stmt.setInt(1, p.getCode());
			stmt.setString(2, p.getName());
			stmt.setDouble(3, p.getPrice());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Product find(int code) {
		String sql = "Select * from product where code =?";
		try {
			Connection conn = JdbcFactory.getConnection();
			ResultSet rs = conn.createStatement().executeQuery(sql);
			Product p = new Product();
			if (rs.next()) {
				p = new Product();
				p.setCode(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPrice(rs.getDouble(3));
			}
			// Create Product class object with result set record
			return p;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;

		}

	}

	public List<Product> list() {
		String sql = "select * from product";
		try {
			Connection conn = JdbcFactory.getConnection();
			ResultSet rs = conn.createStatement().executeQuery(sql);

			List<Product> products = new ArrayList<Product>();
			// Create List<Product> from records of result set
			while (rs.next()) {
				Product p = new Product();
				p.setCode(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPrice(rs.getDouble(3));
				products.add(p);
			}
			return products;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

	public void delete(int code) {
		String sql = "delete from product where code =" + code;
		try {
			Connection conn = JdbcFactory.getConnection();
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
