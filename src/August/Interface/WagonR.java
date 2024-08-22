package August.Interface;

public class WagonR implements Engine{

    void drive(){

        StartEngine();
        StopEngine();
    }
    @Override
    public void StartEngine() {
        System.out.println("Wagon R is starting");
    }

    @Override
    public void StopEngine() {
        System.out.println("Wagon R is stopping");

    }
}
