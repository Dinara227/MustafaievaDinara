package com.company;


public class Kettle {
    private String manufacture;
    private Country country;
    private double volume;

    Kettle() {
    }

    Kettle(String manufacture) {
        this.manufacture = manufacture;
    }

    public Kettle(String manufacture, Country country, double volume) {
        this.manufacture = manufacture;
        this.country = country;
        this.volume = volume;
    }

    public String getManufacture() {
        return manufacture;
    }

    public Country getCountry() {
        return country;
    }

    public double getVolume() {
        return volume;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Manufacture: " + manufacture + "\nCountry: " + country + "\nVolume: " + volume + "\n";
    }

    @Override
    public int hashCode() {
        return 10 * manufacture.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Kettle)) return false;
        Kettle kettle = (Kettle) obj;
        return this.country.equals(kettle.country);
    }

    public String size() {
        if (volume <= 1.3) {
            return "The kettle has small size.";
        } else if (volume > 1.3 && volume <= 2.4) {
            return "The kettle has medium size.";
        } else {
            return "The kettle has large size.";
        }
    }

    public String continent() {
        switch (country) {
            case CHINA:
            case JAPAN:
            case INDONESIA:
                return "The kettle made in Asia.";
            case GERMANY:
            case UKRAINE:
            case FRANCE:
                return "The kettle made in Europe.";
        }
        return null;
    }
}