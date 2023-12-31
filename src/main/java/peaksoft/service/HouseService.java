package peaksoft.service;

import peaksoft.model.House;

import java.util.List;

public interface HouseService {
    void save(House house);
    List<House> getAllHouses();
    String delete(Long id);
    String update(Long id, House newHouse);
    House getById(Long id);
}
