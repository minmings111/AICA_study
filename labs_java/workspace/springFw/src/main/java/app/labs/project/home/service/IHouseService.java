package app.labs.project.home.service;

import java.util.List;

import app.labs.project.model.House;

public interface IHouseService {
	List<House> getAllHouses();
    House getHouseByIdx(int houseIdx);
}
