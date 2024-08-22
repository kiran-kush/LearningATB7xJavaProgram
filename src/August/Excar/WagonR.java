package August.Excar;

 class WagonR extends Engine {

    void drive(){

        start();
        stop();
        partGearBox();
        OpenCar();
    }

    @Override
    void stop() {
        System.out.println("stop the car");
    }

    @Override
    void start() {
        System.out.println("start the car");

    }

    @Override
    void partGearBox() {
        System.out.println("Ger box part");

    }

    @Override
    void OpenCar() {
        System.out.println("open the car");
    }
}
