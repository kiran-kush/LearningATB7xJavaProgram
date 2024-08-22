package August.Excar;

abstract class Car extends Engine {
    @Override
    void stop() {
        System.out.println("Stop the car");
    }

    @Override
    void start() {
        System.out.println("start the car");

    }

    @Override
    void partGearBox() {
        System.out.println("GearBox Part");
    }

    @Override
    void OpenCar() {
        System.out.println("Open the car");
    }
// Engine
    // Gearbox
    // Keys
    // tesla


}
