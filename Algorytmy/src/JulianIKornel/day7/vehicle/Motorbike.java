package JulianIKornel.day7.vehicle;


public class Motorbike extends Vehicle implements HasEngine {

    private boolean engineRunning;

    public Motorbike() {
        super(2);
    }

    @Override
    public void ride() {
        System.out.println("i ride motorbike");
        startEngine();
    }

    @Override
    public void brake() {
        System.out.println("i brake my motorbike");
        stopEngine();
    }

    @Override
    public void stopEngine() {
        if (engineRunning) {
            engineRunning = false;
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
}

