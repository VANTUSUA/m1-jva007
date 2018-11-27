package animals;

public class Predators extends Animals{
    String fangs;

    public String getFangs() {
        return fangs;
    }

    public void setFangs(String fangs) {
        this.fangs = fangs;
    }

    public Predators() {
        fangs = "Sharp fangs";
    }
}
