package repository;
import model.House;

import java.util.ArrayList;
import java.util.List;

public class HouseRepository {
    public static List<House> getHouseList() {
        List<House> houses = new ArrayList<>();
        houses.add(new House("House", 450_000, 120, 3, 1));
        houses.add(new House("House", 475_000, 130, 3, 1));
        houses.add(new House("House", 500_000, 140, 4, 1));
        return houses;
    }

    public static List<House> getVillaList() {
        List<House> villas = new ArrayList<>();
        villas.add(new House("Villa", 1_100_000, 250, 5, 2));
        villas.add(new House("Villa", 1_200_000, 300, 6, 2));
        villas.add(new House("Villa", 1_500_000, 350, 7, 2));
        return villas;
    }

    public static List<House> getSummerHouseList() {
        List<House> summerHouses = new ArrayList<>();
        summerHouses.add(new House("SummerHouse", 600_000, 100, 2, 1));
        summerHouses.add(new House("SummerHouse", 650_000, 110, 2, 1));
        summerHouses.add(new House("SummerHouse", 750_000, 120, 3, 1));
        return summerHouses;
    }
}
