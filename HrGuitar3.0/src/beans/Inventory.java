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

	// ��Ӽ���
	public void addGuitar(Guitar guitar)
	{
		guitars.add(guitar);
	}

	// ��ѯ����
	public List<Guitar> searchGuitar()
	{
		return guitars;
	}

	// ɾ������
	public void delGuitar(String serialNumber)
	{

	}

}
