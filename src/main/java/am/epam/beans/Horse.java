package am.epam.beans;

public class Horse {
    private String breed;
    private int raceNumber;
    private String rider;

    public Horse(String breed, int raceNumber, String rider) {
        this.breed = breed;
        this.raceNumber = raceNumber;
        this.rider = rider;
    }

    public String getBreed() {
        return breed;
    }

    public int getRaceNumber() {
        return raceNumber;
    }

    public String getRider() {
        return rider;
    }



        @Override
    public String toString() {
        return  "breed='" + breed + '\''+',' +
                " raceNumber=" + raceNumber+',' +
                " rider='" + rider + '\''+',' +
                "\n";
    }

}
