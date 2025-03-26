package model;

public class House {
    private String type;
    private int price;
    private int squareMeters;
    private int numberOfRooms;
    private int numberOfLivingRooms;

    public House(String type, int price, int squareMeters, int numberOfRooms, int numberOfLivingRooms) {
        this.type = type;
        this.price = price;
        this.squareMeters = squareMeters;
        this.numberOfRooms = numberOfRooms;
        this.numberOfLivingRooms = numberOfLivingRooms;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public int getSquareMeters() {
        return squareMeters;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfLivingRooms() {
        return numberOfLivingRooms;
    }

    @Override
    public String toString() {
        return type + ": " + price + ", " + squareMeters + " m2, " + numberOfRooms + "+" + numberOfLivingRooms;
    }
}
