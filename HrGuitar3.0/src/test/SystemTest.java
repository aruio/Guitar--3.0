package test;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import dao.DaoFactory;
import dao.IGuitarDao;
import util.MySqlDBUtil;
import util.SqliteDBUtil;
public class SystemTest
{
	public static void main(String[] args)
	{
		Connection conn = SqliteDBUtil.getConnection();
		System.out.println(conn);

		Connection conn2 = MySqlDBUtil.getConnection();
		System.out.println(conn2);

		IGuitarDao gd = DaoFactory.createGuitarDao();
		PreparedStatement pstmt = null;
		String sql1 = "INSERT INTO guitar(serialNumber,price,builder,model,type,backWood,topWood) VALUES (?,?,?,?,?,?,?)";
		try
		{
			pstmt = conn.prepareStatement(sql1);
			pstmt.setString(1, "0009");
			pstmt.setDouble(2, 354.0);
			pstmt.setString(3, "ShangHai");
			pstmt.setString(4, "KAJHE");
			pstmt.setString(5, "ElectricGuitar");
			pstmt.setString(6, "softwood");
			pstmt.setString(7, "hardwood");
			if (pstmt.executeUpdate() > 0)
			{
				System.out.print("sql1 success");
			}
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
}
