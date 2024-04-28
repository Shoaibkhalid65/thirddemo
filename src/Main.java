//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car=new Car();
        car.setMake("Rolls Royce");
        System.out.println(car.getMake());
        car.setModel("20");
        System.out.println(car.getModel());
        car.setYear(2024);
        System.out.println(car.getYear());
        car.setColor("Grey");
        System.out.println(car.getColor());
        car.setPrice(350000.00);
        System.out.println(car.getPrice());
        car.setMileage(120);
        System.out.println(car.getMileage());
        car.setRunning(true);
        System.out.println(car.isRunning());
        car.setLocked(false);
        System.out.println(car.isLocked());
        car.setEngineOn(true);
        System.out.println(car.isEngineOn());
        car.setLightsOn(true);
        System.out.println(car.isLightsOn());
        car.start();
        car.stop();
        car.accelerate();
        car.brake();
        car.lock();
        car.unlock();
        car.turnOnLights();
        car.turnOffLights();
        car.turnOnEngine();
        car.turnOffEngine();


    }
}