package app.labs.project.home.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import app.labs.project.model.House;

@Repository
public class HouseRepository implements IHouseRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	
	@Override
	public List<House> selectAllHouses() {
		String sql = "SELECT houseIdx, houseName, housePrice, houseEffect FROM house";
		return jdbcTemplate.query(sql,
		        new BeanPropertyRowMapper<>(House.class)
		        );
	}

	
	@Override
	public House lookupHouse(int houseIdx) {
		String sql = "SELECT houseIdx, houseName, housePrice, houseEffect FROM house WHERE houseIdx=?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(House.class), houseIdx);
    }

}


