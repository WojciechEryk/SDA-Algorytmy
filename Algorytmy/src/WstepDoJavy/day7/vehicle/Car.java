package JulianIKornel.day7.vehicle;


public class Car extends Vehicle implements HasEngine, AirConditon {

    private boolean engineRunning;

    public Car() {
        super(4);
    }

    @Override
    public void ride() {
        System.out.println("i drive car");
        startEngine();
        turnOnAC(23);

    }

    @Override
    public void brake() {
        System.out.println("i brake my car");
        stopEngine();
    }

    @Override
    public void stopEngine() {
        if (engineRunning) {
            engineRunning = false;
            turnOffAC();
            System.out.println("I stop engine");
        }
    }

    @Override
    public void startEngine() {
        if (!engineRunning) {
            engineRunning = true;
            System.out.println("I start engine");
        }

    }

    @Override
    public void turnOnAC(int temperature) {
        System.out.println("I set temperature = [" + temperature + "]" + "C");
    }

    @Override
    public void turnOffAC() {
        System.out.println("I turn off");

    }


}


