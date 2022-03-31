public class Airplane {

    private String make;
    private int numberOfSeats;
    private Engine engine;

    public String getMake() {
        return make;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getHorsepower() {
        return engine.getHorsepower();
    }

    public int getYearOfManufacture() {
        return engine.getYearOfManufacture();
    }

    boolean isEcological(){
        return getHorsepower() <= 20000 && getYearOfManufacture() > 2000;
    }
}