import model.House;
import repository.HouseRepository;
import service.HouseService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<House> houses = HouseRepository.getHouseList();
        List<House> villas = HouseRepository.getVillaList();
        List<House> summerHouses = HouseRepository.getSummerHouseList();

        List<House> allHouses = new ArrayList<>();
        allHouses.addAll(houses);
        allHouses.addAll(villas);
        allHouses.addAll(summerHouses);

        HouseService service = new HouseService();

        System.out.println("Total price of Houses: " + service.getTotalPrice(houses));
        System.out.println("Total price of Villas: " + service.getTotalPrice(villas));
        System.out.println("Total price of Summer Houses: " + service.getTotalPrice(summerHouses));
        System.out.println("Total price of All Houses: " + service.getTotalPrice(allHouses));

        System.out.println("Average square meters of Houses: " + service.getAverageSquareMeters(houses));
        System.out.println("Average square meters of Villas: " + service.getAverageSquareMeters(villas));
        System.out.println("Average square meters of Summer Houses: " + service.getAverageSquareMeters(summerHouses));
        System.out.println("Average square meters of All Houses: " + service.getAverageSquareMeters(allHouses));

        System.out.println("\nFiltered houses with 3 rooms and 1 living room:");
        List<House> filtered = service.filterHousesByRoomAndLivingRoom(allHouses, 3, 1);
        filtered.forEach(System.out::println);
    }
}