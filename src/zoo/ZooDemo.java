package zoo;

public class ZooDemo {
    public static void main(String[] args) {
        Predators p = new Predators();
        System.out.println("New predator has arrived");
        System.out.println(p.getVoice());

        Cat cat = new Cat();
        System.out.println("New cat is born \n ");
        System.out.println(cat.name="Cat has name => Tom");

        Hippo h = new Hippo();
        System.out.println("New Hippo has arrived");
        h.eat();
        System.out.println("Hippo is eating");

    }
}
