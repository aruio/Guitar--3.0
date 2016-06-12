package beans;
import java.util.ArrayList;
import java.util.List;
import beans.Guitar;
public class Inventory
{
	private List<Guitar> guitars;

	public Inventory()
	{
		guitars = new ArrayList<Guitar>();
	}

	// 添加吉他
	public void addGuitar(Guitar guitar)
	{
		guitars.add(guitar);
	}

	// 查询吉他
	public List<Guitar> searchGuitar()
	{
		return guitars;
	}

	// 删除吉他
	public void delGuitar(String serialNumber)
	{

	}

}
