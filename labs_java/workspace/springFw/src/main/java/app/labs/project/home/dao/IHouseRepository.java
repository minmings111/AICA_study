package app.labs.project.home.dao;

import java.util.List;

import app.labs.project.model.House;

public interface IHouseRepository {
	
	List<House> selectAllHouses();
	
	House lookupHouse(int houseIdx);
}
