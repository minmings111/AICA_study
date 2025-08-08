package app.labs.project.home.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.labs.project.home.dao.IHouseRepository;
import app.labs.project.model.House;

@Service
public class HouseService implements IHouseService {
	
	@Autowired
    private IHouseRepository houseRepository;
	
	
	@Override
	public List<House> getAllHouses() {
		return houseRepository.selectAllHouses();
		
	}

	@Override
	public House getHouseByIdx(int houseIdx) {
		return houseRepository.lookupHouse(houseIdx);
		
	}

}
