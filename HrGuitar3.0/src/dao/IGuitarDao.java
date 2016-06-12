package dao;

import java.util.List;

import beans.Guitar;
import beans.GuitarSpec;


public interface IGuitarDao {


	public void addGuitar(Guitar guitar);


	public List<Guitar> searchGuitar();


	public void delGuitar(String serialNumber);

}
