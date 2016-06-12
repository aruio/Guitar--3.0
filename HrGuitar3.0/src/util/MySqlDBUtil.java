
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySqlDBUtil
{
	public static final String url = "jdbc:mysql://localhost:3306/guitarshop";
	public static final String name = "com.mysql.jdbc.Driver";
	public static final String user = "root";
	public static final String password = "123456";

	public static Connection conn = null;

	public static void main(String[] args)
	{
		Connection conn = MySqlDBUtil.getConnection();

		System.out.println(conn);
	}

	public static Connection getConnection()
	{
		try
		{
			Class.forName(name);
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e)
		{
			e.printStackTrace();
		}

		return conn;
	}

	public void close()
	{
		try
		{
			this.conn.close();
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
	}

}
