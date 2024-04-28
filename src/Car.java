public class Car {
    private String make;
    private String model;
    private int year;
    private String color;
    private double price;
    private int mileage;
    private boolean isRunning;
    private boolean isLocked;
    private  boolean isEngineOn;
    private boolean isLightsOn;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public boolean isEngineOn() {
        return isEngineOn;
    }

    public void setEngineOn(boolean engineOn) {
        isEngineOn = engineOn;
    }

    public boolean isLightsOn() {
        return isLightsOn;
    }

    public void setLightsOn(boolean lightsOn) {
        isLightsOn = lightsOn;
    }
    void start(){
        System.out.println("The car is start");
    }
    void stop(){
        System.out.println("The car is stop");
    }
    void accelerate(){
        System.out.println("The car is accelerated");
    }
    void brake(){
        System.out.println("The car is braked");
    }
    void lock(){
        System.out.println("The car is locked");
    }
    void unlock(){
        System.out.println("The car is unlocked ");
    }
    void turnOnLights(){
        System.out.println("Turn ON the lights of the car");
    }
    void turnOffLights(){
        System.out.println("Turn OFF the lights of the car");
    }
    void turnOnEngine(){
        System.out.println("Turn ON the Engine  of the car");
    }
    void turnOffEngine(){
        System.out.println("Turn OFF the Engine  of the car");
    }

}
