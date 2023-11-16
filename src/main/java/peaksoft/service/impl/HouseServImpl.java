package peaksoft.service.impl;

import peaksoft.model.House;
import peaksoft.repository.HouseRepository;
import peaksoft.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HouseServImpl implements HouseService {
   @Autowired
    private HouseRepository houseRepository;

    @Override
    public void save(House house) {
        houseRepository.save(house);
    }
    @Override
    public List<House> getAllHouses() {
        return houseRepository.getAllHouses();
    }

    @Override
    public String delete(Long id) {
        return houseRepository.delete(id);
    }

    @Override
    public String update(Long id, House newHouse) {
        return houseRepository.update(id,newHouse);
    }

    @Override
    public House getById(Long id) {
        return houseRepository.getById(id);
    }
}
