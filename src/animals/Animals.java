package animals;

public class Animals {
    public String roar;

    {
        roar = "R-r-r-r-r";
    }
    private String name;
    private double weight;

    public String getRoar() {
        return roar;
    }

    public void setRoar(String roar) {
        this.roar = roar;
    }

    private String roar() {
        return roar;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
