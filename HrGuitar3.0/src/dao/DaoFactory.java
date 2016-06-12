package dao;
import mysqlDao.MysqlGuitarDaoImpl;
import sqliteDao.SqliteGuitarDaoImpl;

public class DaoFactory
{
	private static String db="sqlite";
	//private static String db = "mysql";

	public static IGuitarDao createGuitarDao()
	{
		IGuitarDao test = null;
		switch (db)
		{
		case "sqlite":
			test = new SqliteGuitarDaoImpl();
			break;
		case "mysql":
			test = new MysqlGuitarDaoImpl();
			break;
		}
		return test;

	}

}
