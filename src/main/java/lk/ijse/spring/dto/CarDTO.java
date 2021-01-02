package lk.ijse.spring.dto;

import java.util.Arrays;

public class CarDTO {

    private String registrationNumber;
    private String brand;
    private String type;
    private int numberOfPassengers;
    private String transmissionType;
    private String fuelType;
    private String pricesFortheRentDuration;
    private double priceForExtraKm;
    private String color;
    private String path;
    private String year;
    private String isAvailable;
    private String image;

    public CarDTO() {
    }

    public CarDTO(String registrationNumber, String brand, String type, int numberOfPassengers, String transmissionType, String fuelType, String pricesFortheRentDuration, double priceForExtraKm, String color, String path, String year, String isAvailable, String image) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.type = type;
        this.numberOfPassengers = numberOfPassengers;
        this.transmissionType = transmissionType;
        this.fuelType = fuelType;
        this.pricesFortheRentDuration = pricesFortheRentDuration;
        this.priceForExtraKm = priceForExtraKm;
        this.color = color;
        this.path = path;
        this.year = year;
        this.isAvailable = isAvailable;
        this.image = image;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getPricesFortheRentDuration() {
        return pricesFortheRentDuration;
    }

    public void setPricesFortheRentDuration(String pricesFortheRentDuration) {
        this.pricesFortheRentDuration = pricesFortheRentDuration;
    }

    public double getPriceForExtraKm() {
        return priceForExtraKm;
    }

    public void setPriceForExtraKm(double priceForExtraKm) {
        this.priceForExtraKm = priceForExtraKm;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(String isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "CarDTO{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", numberOfPassengers=" + numberOfPassengers +
                ", transmissionType='" + transmissionType + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", pricesFortheRentDuration='" + pricesFortheRentDuration + '\'' +
                ", priceForExtraKm=" + priceForExtraKm +
                ", color='" + color + '\'' +
                ", path='" + path + '\'' +
                ", year='" + year + '\'' +
                ", isAvailable='" + isAvailable + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
