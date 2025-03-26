package service;
import model.House;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HouseService {
    public int getTotalPrice(List<House> houses) {
        return houses.stream().mapToInt(House::getPrice).sum();
    }

    public double getAverageSquareMeters(List<House> houses) {
        return houses.stream().mapToInt(House::getSquareMeters).average().orElse(0);
    }

    public List<House> filterHousesByRoomAndLivingRoom(List<House> allHouses, int roomCount, int livingRoomCount) {
        return allHouses.stream()
                .filter(h -> h.getNumberOfRooms() == roomCount && h.getNumberOfLivingRooms() == livingRoomCount)
                .collect(Collectors.toList());
    }
}
