/**
 * 
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class SqliteDBUtil
{
	public static final String url = "jdbc:sqlite://d:/HrGuitar2.db";
	public static final String name = "org.sqlite.JDBC";

	public static void main(String[] args)
	{
		Connection conn = SqliteDBUtil.getConnection();

		System.out.println(conn);
	}

	public static Connection getConnection()
	{
		try
		{
			Class.forName(name);
			return DriverManager.getConnection(url);
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void closeConnection(Connection conn)
	{
		if (conn != null)
		{
			try
			{
				conn.close();
			} catch (SQLException e)
			{
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}

	}
}
