package animals;

public class Cat extends Pets {
    String name;

    @Override
    public String getName() {
        System.out.println();
        return name;
    }

    public Cat() {
        this.name = "Barsik";
    }
}
