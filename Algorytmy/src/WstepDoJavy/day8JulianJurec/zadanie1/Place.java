package JulianIKornel.day8JulianJurec.zadanie1;

class Place {
    private String name;
    private int duration;

    Place(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getDuration() {
        return duration;
    }

    void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return name + " takes " + duration + " hours to visit.";
    }

}
